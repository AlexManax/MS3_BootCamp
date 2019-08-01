package com.ms3.bootcamp.ships;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ship", schema = "starTrackShips")
public class Ship {

    @Id
    @Column(name = "idship", nullable = false)
    private int idShip;
    @Column(name = "nameship", nullable = false)
    private String nameShip;
    @Column(name = "crewsize", nullable = false)
    private int crewSize;
    @Column(name = "speed", nullable = false)
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

    @Override
    public String toString() {
        return "Ship{" +
                "idShip=" + idShip +
                ", nameShip='" + nameShip + '\'' +
                ", crewSize=" + crewSize +
                ", speed=" + speed +
                '}';
    }
}
