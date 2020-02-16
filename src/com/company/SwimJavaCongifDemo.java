package com.company;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaCongifDemo {

    public static void main(String[] args) {
	// write your code here


        // read spring config file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from spring container
        SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);



        //call methodMain
        System.out.println(theCoach.GetDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println("---------");

        System.out.println(theCoach.getTeam());

        System.out.println(theCoach.getEmail());

        //close
        context.close();

    }
}
