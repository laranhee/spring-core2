package com.nhnent.benjamin.service;

import com.nhnent.benjamin.vo.Member;

/**
 * Created by benjamin on 2017. 1. 16..
 */
public interface MemberService {

    Member createMember(String email, String password, String name);

    Member getMember(String email, String password) throws Exception;

    void exchangeMemberName(Member member1, Member member2) throws Exception;

}
