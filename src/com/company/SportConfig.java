package com.company;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:Sport.properties")
//@ComponentScan("com.company")
public class SportConfig {
    @Bean
    public IFortuneService sadFortuneService(){
        return new SadFortuneService();
    }
    @Bean
    public ICoach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }


}
