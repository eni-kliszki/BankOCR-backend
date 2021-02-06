package com.iotincpector.bankocr.controller;

import com.iotincpector.bankocr.model.ReadFromTxtFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
public class AccountController {

    private final String PATH1 = "src/main/java/com/iotincpector/bankocr/resource/accountText_us1.txt";
    private final String PATH3 = "src/main/java/com/iotincpector/bankocr/resource/accountText_us3.txt";

    @Autowired
    ReadFromTxtFile readFromTxtFile;

    //method to get the valid accounts as an array of strings for user story 1 and 2
    @GetMapping("/user-story1")
    public List<String> getAccounts(){
        try {
            return readFromTxtFile.read(PATH1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    //method to get the valid and invalid accounts as an array of strings for user story 3
    @GetMapping("/user-story3")
    public List<String> getAccountsWithIllAccounts(){
        try {
            return readFromTxtFile.read(PATH3);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    //method to get the valid and invalid accounts as an array of strings for user story  4
    @GetMapping("/user-story4")
    public List<String> getAccountsUS4(){
        try {
            return readFromTxtFile.read(PATH3);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
