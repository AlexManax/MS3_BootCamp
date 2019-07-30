package com.ms3.bootcamp.entity;

public class Member {
    private int idMember;
    private String nameMember;
    private int rank;
    private int idShip;

    public Member() {
    }

    public Member(int idMember, String nameMember, int rank, int idShip) {
        super();
        this.idMember = idMember;
        this.nameMember = nameMember;
        this.rank = rank;
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

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getIdShip() {
        return idShip;
    }

    public void setIdShip(int idShip) {
        this.idShip = idShip;
    }
}
