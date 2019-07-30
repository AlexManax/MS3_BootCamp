package com.ms3.bootcamp.entity;

import java.util.List;

public class Ship {
    private int idShip;
    private String nameShip;
    private int crewSize;
    private double speed;
    private List<Member> members = null;

    public Ship() {
    }

    public Ship(int idShip, String nameShip, int crewSize, double speed, List<Member> members) {
        super();
        this.idShip = idShip;
        this.nameShip = nameShip;
        this.crewSize = crewSize;
        this.speed = speed;
        this.members = members;
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

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
