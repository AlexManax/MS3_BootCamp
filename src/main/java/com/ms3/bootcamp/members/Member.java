package com.ms3.bootcamp.members;

import javax.persistence.*;

@Entity
@Table(name = "crewmembers", schema = "starTrackShips")
public class Member {

    @Id
    @Column(name = "idmember", nullable = false)
    private int idMember;
    @Column(name = "namemember", nullable = false)
    private String nameMember;
    @Column(name = "rankmember", nullable = false)
    private int rankMember;
    @Column(name = "idship", nullable = false)
    private int idShip;

    public Member() {
    }

    public Member(int idMember, String nameMember, int rankMember, int idShip) {
        super();
        this.idMember = idMember;
        this.nameMember = nameMember;
        this.rankMember = rankMember;
        this.idShip = idShip;
    }

    public int getIdMember() {
        return idMember;
    }

    public void setIdMember(int idMember) {
        this.idMember = idMember;
    }

    public String getNameMember() {
        return nameMember;
    }

    public void setNameMember(String nameMember) {
        this.nameMember = nameMember;
    }

    public int getRankMember() {
        return rankMember;
    }

    public void setRankMember(int rankMember) {
        this.rankMember = rankMember;
    }

    public int getIdShip() {
        return idShip;
    }

    public void setIdShip(int idShip) {
        this.idShip = idShip;
    }
}
