package com.udemy.learn.UdemyLern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

    // define the dependency for injection
//use firld injection for the field
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

//define the setter method
/*	@Autowired
public void setFortuneService(FortuneService fortuneService) {
	System.out.println("Inside setter method");
	this.fortuneService = fortuneService;
}
*/

// define constructor for dependency injection
/*@Autowired
public TennisCoach(FortuneService fortuneService) {
this.fortuneService = fortuneService;
}*/

    //define a method for dependency injection
/*public void doSomeCrazyStuff(FortuneService fortuneService) {
	System.out.println("Inside setter method");
	this.fortuneService = fortuneService;
}
*/
    public String getDailyWorkout() {
        return " Practice your backhand volley";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @PostConstruct
    public void doMyStartStuff(){
        System.out.println("Im inside init method");
    }
    @PreDestroy
    public void doMyDestroyStuff(){
        System.out.println("Im inside destroy method");
    }


}