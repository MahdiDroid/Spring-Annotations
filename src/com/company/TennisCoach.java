package com.company;
//import javax.annotation;
//import javax.annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()  //bean Id  default bean Id is classname  start with lower case.
//@Scope("prototype")
public class TennisCoach implements ICoach {

    @Autowired
    @Qualifier("randomFortuneService")
    private IFortuneService fortuneService;

    public void  TennisCoach() {
        System.out.println(">> inside default constructor");
    }

    @Override
    public String GetDailyWorkout() {

        return "practice your backend volley";
    }
    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune()   ;
    }
//    @PostConstruct
    public void doMyStartuostuff(){
        System.out.println("before initializing method");
    }

//    @PreDestroy
    public void doSomecleanUpStuff(){
        System.out.println("cleaning stuff method");
    }



//    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }


//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println(">> inside setFortune");
//        this.fortuneService = fortuneService;
//    }




}
