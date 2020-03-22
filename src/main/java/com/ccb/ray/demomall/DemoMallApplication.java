package com.ccb.ray.demomall;

import com.ccb.ray.demomall.aop.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoMallApplication{
    @Autowired
    private Buyer buyer;

    public static void main(String[] args) {
        SpringApplication.run(DemoMallApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        buyer.servicce();
//    }
}
