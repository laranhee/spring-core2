package com.nhnent.benjamin;

import com.nhnent.benjamin.config.ApplicationContextConfig;
import com.nhnent.benjamin.service.MemberService;
import com.nhnent.benjamin.vo.Member;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by benjamin on 2017. 1. 15..
 */
public class Server {

    public static void main(String args[]) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);

        MemberService memberService = context.getBean(MemberService.class);


        Member member1 = memberService.createMember("benjmain1@nhnent.com", "123123", "부릉");
        Member member2 = memberService.createMember("benjmain2@nhnent.com", "234234", "김병부");

        System.out.println(member1);
        System.out.println(member2);

        memberService.exchangeMemberName(member1, member2);

        System.out.println(member1);
        System.out.println(member2);

        context.close();
    }
}
