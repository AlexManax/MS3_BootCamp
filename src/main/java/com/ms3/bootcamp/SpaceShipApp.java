package com.ms3.bootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpaceShipApp {
    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("root"));


        SpringApplication.run(SpaceShipApp.class, args);
    }
}
