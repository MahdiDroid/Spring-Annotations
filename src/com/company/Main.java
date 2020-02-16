package com.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
	// write your code here


        // read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //get the bean from spring container
        ICoach theCoach = context.getBean("tennisCoach",ICoach.class);



        //call method
        System.out.println(theCoach.GetDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        //close
        context.close();

    }
}
