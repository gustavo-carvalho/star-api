package com.carvalho.gustavo.starapi.planet;


import com.carvalho.gustavo.starapi.StarApiApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(StarApiApplication.BASE_URL + "/planets")
@RestController
public class PlanetController {
    @Autowired
    private PlanetService planetService;


    @GetMapping
    public List<PlanetEntity> getAll() {
        return this.planetService.getAll();
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<PlanetEntity> getBy(@PathVariable long id) {
        return this.planetService.getBy(id);
    }

    @GetMapping(path = {"/find/{name}"})
    public ResponseEntity<PlanetEntity> getBy(@PathVariable String name) {
        return this.planetService.getBy(name);
    }

    @PostMapping
    public PlanetEntity add(@RequestBody PlanetEntity planet){
        return planetService.add(planet);
    }

    @DeleteMapping(path = {"/{id}"})
    public void delete(@PathVariable long id) {
        planetService.delete(id);
    }
}
