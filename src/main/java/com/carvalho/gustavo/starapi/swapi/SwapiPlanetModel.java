package com.carvalho.gustavo.starapi.swapi;

import java.util.List;

public class SwapiPlanetModel {
    private String name;
    private List<String> films;

    public SwapiPlanetModel() {
    }

    public SwapiPlanetModel(String name, List<String> films) {
        this.name = name;
        this.films = films;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getFilms() {
        return films;
    }

    public void setFilms(List<String> films) {
        this.films = films;
    }
}
