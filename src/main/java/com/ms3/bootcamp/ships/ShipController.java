package com.ms3.bootcamp.ships;

import com.ms3.bootcamp.httpErrors.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShipController {

    @Autowired
    private ShipService shipService;

    @GetMapping("/ships")
    public List<Ship> getAllShips() {
        return shipService.getAllShips();
    }

    @GetMapping("/ships/{idShip}")
    public Ship getShip(@PathVariable int idShip) {
        if (shipService.isExist(idShip)) {
            return shipService.getShip(idShip);
        } else {
            throw new NotFoundException("Ship with ID " + idShip + " not found");
        }
    }

    @PostMapping(value = "/ships")
    public void addShip(@RequestBody Ship ship) {
        shipService.addShips(new Ship(ship.getNameShip(), ship.getCrewSize(), ship.getSpeed()));
    }

    @PutMapping(value = "/ships/{idShip}")
    public void updateShip(@PathVariable int idShip, @RequestBody Ship ship) {
        if (shipService.isExist(idShip)) {
            ship.setIdShip(idShip);
            shipService.updateShips(ship);
        } else {
            throw new NotFoundException("Ship " + ship + " with ID " + idShip + " not found");
        }
    }

    @DeleteMapping(value = "/ships/{idShip}")
    public void deleteShip(@PathVariable int idShip) {
        shipService.deleteShip(idShip);
    }

}
