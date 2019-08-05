package com.ms3.bootcamp.ships;

import org.springframework.data.repository.CrudRepository;

public interface ShipRepository extends CrudRepository<Ship, Integer> {
    @Override
    Iterable<Ship> findAll();
}
