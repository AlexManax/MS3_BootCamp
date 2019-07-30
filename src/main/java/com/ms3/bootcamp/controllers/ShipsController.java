package com.ms3.bootcamp.controllers;

import com.ms3.bootcamp.entity.Member;
import com.ms3.bootcamp.entity.Ship;
import com.ms3.bootcamp.service.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShipsController {

    @Autowired
    private ShipService shipService;

    @RequestMapping("/ships")
    public List<Ship> sayHi() {
        return shipService.getAllShips();
    }

    @RequestMapping("/ships/{idShip}")
    public Ship getShip(@PathVariable String idShip) {
        return shipService.getShip(idShip);
    }

    @RequestMapping(value = "/ships", method = RequestMethod.POST)
    public void addShip(@RequestBody Ship ship) {
        shipService.addShips(ship);
    }

    @RequestMapping(value = "/ships/{idShip}", method = RequestMethod.PUT)
    public void updateShip(@PathVariable int idShip, @RequestBody Ship ship) {
        shipService.updateShips(idShip, ship);
    }

    @RequestMapping(value = "/ships/{idShip}", method = RequestMethod.DELETE)
    public void deleteShip(@PathVariable int idShip) {
        shipService.deleteShip(idShip);
    }

}
