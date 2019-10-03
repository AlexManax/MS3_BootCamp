package com.ms3.bootcamp.ships;

import com.ms3.bootcamp.members.Member;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ships", schema = "starTrackShips")
@Data
public class Ship {
    @Id
    @Column(name = "idship", nullable = false)
    private int idShip;
    @Column(name = "nameship", nullable = true)
    private String nameShip;
    @Column(name = "crewsize", nullable = true)
    private int crewSize;
    @Column(name = "speed", nullable = true)
    private double speed;

    @Transient
    private List<Member> memberList;

    public Ship() {
    }

    public Ship(String nameShip, int crewSize, double speed) {
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

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }
}
