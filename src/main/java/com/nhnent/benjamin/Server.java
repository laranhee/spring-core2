package com.nhnent.benjamin;

import com.nhnent.benjamin.config.ApplicationContextConfig;
import com.nhnent.benjamin.dao.MemberDao;
import com.nhnent.benjamin.model.Pizza;
import com.nhnent.benjamin.vo.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

/**
 * Created by benjamin on 2017. 1. 15..
 */
public class Server {
    private static final Logger LOGGER = LoggerFactory.getLogger(Server.class);

    public static void main(String args[]) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);

        MemberDao memberDao = context.getBean(MemberDao.class);

        Member member = memberDao.exist("dongmyo@nhnent.com", "12345");
        if (member == null) {
            member = new Member();
            member.setEmail("dongmyo@nhnent.com");
            member.setPassword("12345");
            member.setName("dongmyo");
            member.setCreatedDate(new Date());
            member.setModifiedDate(new Date());

            try {
                memberDao.insert(member);
            } catch (Exception e) {
                LOGGER.error("{}", e);
            }

            System.out.println("dongmyo NOT exists");
        } else {
            System.out.println(member.getName());
        }

        // TODO : beanDefinition
        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(Pizza.class);

        /*
            cf.) GenericApplicationContext.registerBeanDefinition()

            Class AnnotationConfigApplicationContext

            java.lang.Object
                org.springframework.core.io.DefaultResourceLoader
                    org.springframework.context.support.AbstractApplicationContext
                        org.springframework.context.support.GenericApplicationContext
                            org.springframework.context.annotation.AnnotationConfigApplicationContext
         */
        context.registerBeanDefinition("pizzaBean", beanDefinition);

        Pizza pizzaBean = (Pizza) context.getBean("pizzaBean");
        System.out.println(pizzaBean.getName());

        context.close();

    }
}
