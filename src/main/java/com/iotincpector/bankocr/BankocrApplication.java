package com.iotincpector.bankocr;

import com.iotincpector.bankocr.controller.AccountController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class BankocrApplication {

    @Autowired
    AccountController accountController;

    public static void main(String[] args) {
        SpringApplication.run(BankocrApplication.class, args);
    }

    @PostConstruct
    public void init(){
        accountController.consollog("src/main/java/com/iotincpector/bankocr/resource/accountText_us1.txt");
    }

}
