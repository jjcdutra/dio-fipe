package com.juljocd.consulta_fipe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ConsultaFipeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsultaFipeApplication.class, args);
    }

}
