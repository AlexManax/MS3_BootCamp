package com.ms3.bootcamp.service;

import com.ms3.bootcamp.entity.Member;
import com.ms3.bootcamp.entity.Ship;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ShipService {

    private List<Ship> ships = new ArrayList<>(Arrays.asList(
            new Ship(1,"USS", 10,9.9, new ArrayList<Member>()),
            new Ship(1,"Enterprise", 10,9.9, new ArrayList<Member>()),
            new Ship(2,"USS", 10,9.9, new ArrayList<Member>()),
            new Ship(3,"Enterprise", 10,9.9, new ArrayList<Member>())
    ));

    public List<Ship> getAllShips(){
        return ships;
    }

    public Ship getShip (final String idShip) {
        return ships.stream()
                .filter(ship -> ship.getIdShip()==Integer.parseInt(idShip))
                .findFirst()
                .get();
    }

    public void addShips(Ship ship) {
        ships.add(ship);
    }
}
