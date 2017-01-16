package com.nhnent.benjamin.service.jpn;

import com.nhnent.benjamin.service.MemberService;
import com.nhnent.benjamin.vo.Member;
import org.springframework.stereotype.Service;

/**
 * Created by benjamin on 2017. 1. 16..
 */
@Service
public class MemberServiceImpl implements MemberService{

    @Override
    public Member createMember(String email, String password, String name) {
        return null;
    }

    @Override
    public Member getMember(String email, String password) throws Exception {
        return null;
    }

    @Override
    public void exchangeMemberName(Member member1, Member member2) throws Exception {

    }
}
