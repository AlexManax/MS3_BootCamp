package com.ms3.bootcamp.members;

import com.ms3.bootcamp.httpErrors.NotFoundException;
import com.ms3.bootcamp.ships.ShipService;
import org.hibernate.internal.util.Cloneable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberController extends Cloneable {

    @Autowired
    private MemberService memberService;
    @Autowired
    private ShipService shipService;

    @GetMapping("/members")
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }

    @GetMapping("/ships/{idShip}/members")
    public List<Member> getAllMembersOfShip(@PathVariable int idShip) {
        if (shipService.isExist(idShip)) {
            return memberService.getAllMembersOfShip(idShip);
        } else {
            throw new NotFoundException("Ship with ID " + idShip + " not found");
        }
    }

    @GetMapping("/ships/{idShip}/members/{idMember}")
    public Member getMember(@PathVariable int idShip, @PathVariable int idMember) {
        if (shipService.isExist(idShip)) {
            if (memberService.isExist(idMember)) {
                return memberService.getMember(idMember);
            } else {
                throw new NotFoundException("Member with ID " + idMember + " not found");
            }
        } else {
            throw new NotFoundException("Ship with ID " + idShip + " not found");
        }
    }

    @PostMapping(value = "/ships/{idShip}/members")
    public void addMember(@PathVariable int idShip, @RequestBody Member member) {
        if (shipService.isExist(idShip)) {
            Member member1 = new Member(0,member.getNameMember(),member.getRankMember(),member.getIdShip());
            member.setIdShip(0);
            System.out.println(member);
            memberService.addMember(member1);
        } else {
            throw new NotFoundException("Ship with ID " + idShip + " not found");
        }

    }

    @PutMapping(value = "/ships/{idShip}/members/{idMember}")
    public void updateMember(@PathVariable int idShip, @PathVariable int idMember, @RequestBody Member member) {
        if (shipService.isExist(idShip)) {
            if (memberService.isExist(idMember)) {
                member.setIdMember(idMember);
                member.setIdShip(idShip);
                memberService.updateMember(member);
            } else {
                throw new NotFoundException("Member with ID " + idMember + " not found");
            }
        } else {
            throw new NotFoundException("Ship with ID " + idShip + " not found");
        }
    }

    @DeleteMapping(value = {"/members/{idMember}", "/ships/{idShip}/members/{idMember}", "/ships/members/{idMember}"})
    public void deleteMember(@PathVariable int idMember) {
        if (memberService.isExist(idMember)) {
            memberService.deleteMember(idMember);
        } else {
            throw new NotFoundException("Member with ID " + idMember + " not found");
        }
    }
}