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

    public Member(String nameMember, int rankMember, Integer idShip) {
        this.nameMember = nameMember;
        this.rankMember = rankMember;
        this.idShip = idShip;
    }

}
