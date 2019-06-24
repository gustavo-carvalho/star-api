package com.carvalho.gustavo.starapi.planet;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PlanetEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @NotBlank(message = "Weather is mandatory")
    private String weather;

    @NotBlank(message = "Terrain is mandatory")
    private String terrain;

    private Integer movieAppearances = 0;

    public PlanetEntity() {}

    public PlanetEntity(String name, String weather, String terrain, Integer movieAppearances) {
        this.name = name;
        this.weather = weather;
        this.terrain = terrain;
        this.movieAppearances = movieAppearances;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public Integer getMovieAppearances() {
        return movieAppearances;
    }

    public void setMovieAppearances(Integer movieAppearances) {
        this.movieAppearances = movieAppearances;
    }
}
