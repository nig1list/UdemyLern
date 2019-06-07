package com.udemy.learn.UdemyLern;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaSwimDemoApp {

    public static void main(String[] args) {

//Read the spring config file
/*        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext ("applicationContext.xml");*/
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
//Retrieve bean from the spring container
        Coach theCoach = context.getBean("swimCoach",Coach.class);

//call a method on the bean
        System.out.println("Dailyworkout: " +theCoach.getDailyWorkout());
//call a method on the bean
        System.out.println("DailyFortune: " +theCoach.getDailyFortune());
//close the container
        SwimCoach swimCoach  = context.getBean("swimCoach",SwimCoach.class);
        System.out.println(swimCoach.getEmail());
        System.out.println(swimCoach.getTeam());
        context.close();

    }

}