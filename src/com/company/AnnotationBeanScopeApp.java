package com.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");


        ICoach theCoach = context.getBean("tennisCoach",ICoach.class);
        ICoach theCoach1 = context.getBean("tennisCoach",ICoach.class);

        boolean result = (theCoach==theCoach1);
        System.out.println("REsult is :  " + result);
        context.close();


    }
}
