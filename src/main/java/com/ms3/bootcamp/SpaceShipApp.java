package com.ms3.bootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.ActiveProfiles;

@SpringBootApplication
//@ActiveProfiles("internal")
public class SpaceShipApp {
    public static void main(String[] args) {
        SpringApplication.run(SpaceShipApp.class, args);
    }
}
