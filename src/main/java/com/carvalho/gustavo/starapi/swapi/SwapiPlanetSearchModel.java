package com.carvalho.gustavo.starapi.swapi;

import java.util.ArrayList;
import java.util.List;

public class SwapiPlanetSearchModel {
    private Integer count;
    private List<SwapiPlanetModel> results = new ArrayList<>();

    public SwapiPlanetSearchModel() {
    }

    public SwapiPlanetSearchModel(Integer count, List<SwapiPlanetModel> results) {
        this.count = count;
        this.results = results;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<SwapiPlanetModel> getResults() {
        return results;
    }

    public void setResults(List<SwapiPlanetModel> results) {
        this.results = results;
    }
}
