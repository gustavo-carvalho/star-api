package com.carvalho.gustavo.starapi.planet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
public class PlanetService {
    @Autowired
    private PlanetRepository planetRepository;

    public List<PlanetEntity> getAll() {
        List<PlanetEntity> planets = new ArrayList<>();
        this.planetRepository.findAll().forEach(planets::add);

         return planets;
    }

    @Transactional
    public synchronized PlanetEntity add(PlanetEntity planet) {
        return this.planetRepository.save(planet);
    }

    public ResponseEntity<PlanetEntity> getBy(Long id) {
        return planetRepository.findById(id)
                .map(planet -> ResponseEntity.ok().body(planet))
                .orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<PlanetEntity> getBy(String name) {
        return planetRepository.findByNameContainingIgnoreCase(name)
                .map(planet -> ResponseEntity.ok().body(planet))
                .orElse(ResponseEntity.notFound().build());
    }

    public void delete(Long id) {
        planetRepository.deleteById(id);
    }
}
