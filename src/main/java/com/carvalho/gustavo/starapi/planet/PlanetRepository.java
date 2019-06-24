package com.carvalho.gustavo.starapi.planet;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlanetRepository extends CrudRepository<PlanetEntity, Long> {
    Optional<PlanetEntity> findByNameContainingIgnoreCase(String name);
}
