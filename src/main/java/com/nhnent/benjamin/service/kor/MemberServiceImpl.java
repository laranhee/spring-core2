package com.nhnent.benjamin.service.kor;

import com.nhnent.benjamin.dao.MemberDao;
import com.nhnent.benjamin.service.MemberService;
import com.nhnent.benjamin.stereotype.CustomLogger;
import com.nhnent.benjamin.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by benjamin on 2017. 1. 16..
 */
@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberDao memberDao;

    @Override
    @CustomLogger
    public Member getMember() {
        Member member = memberDao.exist("dongmyo@nhnent.com", "12345");
        if (member == null) {
            member = new Member();
            member.setEmail("dongmyo@nhnent.com");
            member.setPassword("12345");
            member.setName("dongmyo");
            member.setCreatedDate(new Date());
            member.setModifiedDate(new Date());
        }

        return member;
    }
}
