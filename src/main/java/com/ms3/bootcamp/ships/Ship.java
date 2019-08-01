package com.ms3.bootcamp.ships;

import com.ms3.bootcamp.members.Member;
import org.springframework.web.bind.annotation.DeleteMapping;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


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

    @Transient
    private List<Member> memberList;


    public Ship() {
    }

    public Ship(int idShip, String nameShip, int crewSize, double speed) {
        super();
        this.idShip = idShip;
        this.nameShip = nameShip;
        this.crewSize = crewSize;
        this.speed = speed;
        memberList.add(new Member(1,"sddgjhvskvksjfvksjfns",3,1));
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

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }

    public List<Member> getMemberList() {
        return memberList;
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
