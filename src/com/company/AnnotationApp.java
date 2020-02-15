package com.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {

    public static void main(String[] args) {
	// write your code here


        // read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext");

        //get the bean from spring container
        ICoach theCoach = context.getBean("tennisCoach",ICoach.class);


        //call method
        System.out.println(theCoach.GetDailyWorkout());

        //close
        context.close();

    }
}
