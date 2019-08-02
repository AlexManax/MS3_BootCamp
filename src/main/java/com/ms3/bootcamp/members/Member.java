package com.ms3.bootcamp.members;

import javax.persistence.*;

@Entity
@Table(name = "crewmembers", schema = "starTrackShips")
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
        super();
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

    public void setIdMember(Integer idMember) {
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

    public Integer getIdShip() {
        return idShip;
    }

    public void setIdShip(Integer idShip) {
        this.idShip = idShip;
    }

    @Override
    public String toString() {
        return "Member{" +
                "idMember=" + idMember +
                ", nameMember='" + nameMember + '\'' +
                ", rankMember=" + rankMember +
                ", idShip=" + idShip +
                '}';
    }
}
