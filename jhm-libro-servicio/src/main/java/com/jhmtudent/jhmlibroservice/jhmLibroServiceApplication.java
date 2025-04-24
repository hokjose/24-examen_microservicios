package com.jhmtudent.jhmlibroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class jhmLibroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(jhmLibroServiceApplication.class, args);
    }

}
