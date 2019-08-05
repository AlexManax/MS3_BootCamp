package com.ms3.bootcamp.members;

import com.ms3.bootcamp.members.Member;
import com.ms3.bootcamp.members.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public List<Member> getAllMembers() {
        List<Member> memberList = new ArrayList<>();
        memberRepository.findAll()
                .forEach(memberList::add);
        return memberList;
    }

    public List<Member> getAllMembersOfShip(int idShip) {
        return memberRepository.findAllByIdShip(idShip);
    }

    public Member getMember(int idMember) {
        return memberRepository.findOne(idMember);
    }

    public void addMember(Member member) {
        memberRepository.save(member);
    }

    public void updateMember(Member member) {
        memberRepository.save(member);
    }

    public void deleteMember(int idMember) {
        memberRepository.delete(idMember);
    }

    public boolean isExist(int idMember) {
        return memberRepository.exists(idMember);
    }
}
