package com.nhnent.benjamin.repository;

import com.nhnent.benjamin.vo.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Integer> {
    Member findByEmailAndPassword(String email, String password);

}
