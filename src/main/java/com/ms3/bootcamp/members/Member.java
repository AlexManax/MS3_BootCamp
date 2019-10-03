package com.ms3.bootcamp.members;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "crewmembers", schema = "starTrackShips")
@Data
public class Member {

    @Id
    @Column(name = "idmember", nullable = false)
    private Integer idMember;
    @Column(name = "namemember", nullable = true)
    private String nameMember;
    @Column(name = "rankmember", nullable = true)
    private int rankMember;
    @Column(name = "idship", nullable = false)
    private Integer idShip;

    public Member() {
    }

    public Member(Integer idMember, String nameMember, int rankMember, Integer idShip) {
        this.idMember = idMember;
        this.nameMember = nameMember;
        this.rankMember = rankMember;
        this.idShip = idShip;
    }

    public Member(String nameMember, int rankMember, Integer idShip) {
        this.nameMember = nameMember;
        this.rankMember = rankMember;
        this.idShip = idShip;
    }

    public Integer getIdMember() {
        return idMember;
    }

    public String getNameMember() {
        return nameMember;
    }

    public int getRankMember() {
        return rankMember;
    }

    public Integer getIdShip() {
        return idShip;
    }

    public void setIdShip(Integer idShip) {
        this.idShip = idShip;
    }

    public void setIdMember(Integer idMember) {
        this.idMember = idMember;
    }
}
