package com.udemy.learn.UdemyLern;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {
        //Read the spring config file
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext ("applicationContext.xml");
        //Retrieve bean from the spring container
        Coach theCoach = context.getBean("tennisCoach",Coach.class);
        //call a method on the bean
        System.out.println("Dailyworkout: " +theCoach.getDailyWorkout());
        //call a method on the bean
        System.out.println("DailyFortune: " +theCoach.getDailyFortune());
        //close the container
        context.close();
    }

}