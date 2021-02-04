package com.iotincpector.bankocr.controller;

import com.iotincpector.bankocr.model.ReadFromTxtFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
public class AccountController {
    @Autowired
    ReadFromTxtFile readFromTxtFile;

    public void consollog(String path){
        try {
            System.out.println(readFromTxtFile.read(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
