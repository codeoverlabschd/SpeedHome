package com.speedhome.speedhome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpeedhomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpeedhomeApplication.class,
                args);
    }

}
