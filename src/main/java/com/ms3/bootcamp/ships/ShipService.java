package com.ms3.bootcamp.ships;

import com.ms3.bootcamp.members.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShipService {

    @Autowired
    private ShipRepository shipRepository;

    @Autowired
    private MemberRepository memberRepository;


    public List<Ship> getAllShips() {
        List<Ship> shipList = new ArrayList<>();
        shipRepository.findAll()
                .forEach(ship -> {
                            ship.setMemberList(memberRepository.findAllByIdShip(ship.getIdShip()));
                            shipList.add(ship);
                        }
                );
        return shipList;
    }

    public Ship getShip(int idShip) {
        Ship ship = shipRepository.findOne(idShip);
        ship.setMemberList(memberRepository.findAllByIdShip(idShip));
        return ship;
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
