package com.ms3.bootcamp.ships.service;

import com.ms3.bootcamp.ships.entity.Ship;
import com.ms3.bootcamp.ships.reposetory.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShipService {

    @Autowired
    private ShipRepository shipRepository;
//
//    private List<Ship> ships = new ArrayList<>(Arrays.asList(
//            new Ship(1, "USS", 10, 9.9),
//            new Ship(1, "Enterprise", 10, 9.9),
//            new Ship(2, "USS", 10, 9.9),
//            new Ship(3, "Enterprise", 10, 9.9)
//    ));

    public List<Ship> getAllShips() {
        List<Ship> shipList = new ArrayList<>();
        shipRepository.findAll()
                .forEach(shipList::add);
        return shipList;
    }

    public Ship getShip(int idShip) {
        return shipRepository.findOne(idShip);
    }

    public void addShips(Ship ship) {
        shipRepository.save(ship);
    }

    public void updateShips(int idShip, Ship ship) {
        shipRepository.save(ship);
    }

    public void deleteShip(int idShip) {
        shipRepository.delete(idShip);
    }
}
