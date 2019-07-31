package com.ms3.bootcamp.ships.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Ship {

    @Id
    private int idShip;
    private String nameShip;
    private int crewSize;
    private double speed;

    public Ship() {
    }

    public Ship(int idShip, String nameShip, int crewSize, double speed) {
        super();
        this.idShip = idShip;
        this.nameShip = nameShip;
        this.crewSize = crewSize;
        this.speed = speed;
    }

    public int getIdShip() {
        return idShip;
    }

    public void setIdShip(int idShip) {
        this.idShip = idShip;
    }

    public String getNameShip() {
        return nameShip;
    }

    public void setNameShip(String nameShip) {
        this.nameShip = nameShip;
    }

    public int getCrewSize() {
        return crewSize;
    }

    public void setCrewSize(int crewSize) {
        this.crewSize = crewSize;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

}
