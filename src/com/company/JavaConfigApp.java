package com.company;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigApp {

    public static void main(String[] args) {
	// write your code here


        // read spring config file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from spring container
        ICoach theCoach = context.getBean("tennisCoach",ICoach.class);



        //call methodMain
        System.out.println(theCoach.GetDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        //close
        context.close();

    }
}
