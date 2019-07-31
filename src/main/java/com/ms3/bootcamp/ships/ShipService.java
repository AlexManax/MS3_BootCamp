package com.ms3.bootcamp.ships;

import com.ms3.bootcamp.ships.Ship;
import com.ms3.bootcamp.ships.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShipService {

    @Autowired
    private ShipRepository shipRepository;


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

    public void updateShips(Ship ship) {
        shipRepository.save(ship);
    }

    public void deleteShip(int idShip) {
        shipRepository.delete(idShip);
    }

    public boolean isExist(int idShip) {
        return shipRepository.exists(idShip);
    }
}
