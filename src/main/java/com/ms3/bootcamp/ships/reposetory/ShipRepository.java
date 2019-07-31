package com.ms3.bootcamp.ships.reposetory;

import com.ms3.bootcamp.ships.entity.Ship;
import org.springframework.data.repository.CrudRepository;

public interface ShipRepository extends CrudRepository<Ship, Integer> {
    //getAllShips();
    //getShipById(String idShip)
    //updateShip(String idShip, Ship ship)
    //deleteShip(Ship idShip)
    //addShip(Ship ship)

//    public Ship getShipById();


}
