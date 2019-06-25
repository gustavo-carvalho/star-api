package com.carvalho.gustavo.starapi.swapi;

import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Optional;

@Service
public class SwapiService {
    private final String URI = "https://swapi.co/api/planets";

    public Optional<SwapiPlanetModel> fetchPlanetByName(String name) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
        ResponseEntity<SwapiPlanetSearchModel> result = restTemplate.exchange(URI + "/?search="+ name, HttpMethod.GET, entity, SwapiPlanetSearchModel.class);
        return result.getBody().getResults().stream()
                .parallel()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .findAny();
    }
}
