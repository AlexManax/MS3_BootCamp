package com.ms3.bootcamp.members;

import com.ms3.bootcamp.httpErrors.NotFoundException;
import com.ms3.bootcamp.ships.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;
    @Autowired
    private ShipService shipService;

    @RequestMapping("/ships/members")
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }

    @RequestMapping("/ships/{idShip}/members")
    public List<Member> getAllMembersOfShip(@PathVariable int idShip) {
        if (shipService.isExist(idShip)) {
            return memberService.getAllMembersOfShip(idShip);
        } else {
            throw new NotFoundException("Ship with ID " + idShip + " not found");
        }
    }

    @RequestMapping("/ships/{idShip}/members/{idMember}")
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

    @RequestMapping(value = "/ships/{idShip}/members", method = RequestMethod.POST)
    public void addMember(@RequestBody int idShip, @RequestBody Member member) {
        if (shipService.isExist(idShip)) {
            member.setIdShip(idShip);
            memberService.addMember(member);
        } else {
            throw new NotFoundException("Ship with ID " + idShip + " not found");
        }

    }

    @RequestMapping(value = "/ships/{idShip}/members/{idMember}", method = RequestMethod.PUT)
    public void updateMember(@RequestBody int idShip, @RequestBody int idMember, @RequestBody Member member) {
        if (shipService.isExist(idShip)) {
            if (memberService.isExist(idMember)) {
                member.setIdShip(idShip);
                memberService.updateMember(member);
            } else {
                throw new NotFoundException("Member with ID " + idMember + " not found");
            }
        } else {
            throw new NotFoundException("Ship with ID " + idShip + " not found");
        }
    }

    @RequestMapping(value = "/ships/{idShip}/members/{idMember}", method = RequestMethod.DELETE)
    public void deleteMember(@RequestBody int idShip, @RequestBody int idMember) {
        if (shipService.isExist(idShip)) {
            if (memberService.isExist(idMember)) {
                memberService.deleteMember(idMember);
            } else {
                throw new NotFoundException("Member with ID " + idMember + " not found");
            }
        } else {
            throw new NotFoundException("Ship with ID " + idShip + " not found");
        }
    }

}
