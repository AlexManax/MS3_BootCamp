package com.ms3.bootcamp.members;

import com.ms3.bootcamp.members.Member;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MemberRepository extends CrudRepository<Member, Integer> {

    List<Member> findAllByIdShip (int idShip);

}
