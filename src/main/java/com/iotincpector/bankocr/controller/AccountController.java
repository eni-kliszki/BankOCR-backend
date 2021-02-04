package com.iotincpector.bankocr.controller;

import com.iotincpector.bankocr.model.ReadFromTxtFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
public class AccountController {

    private final String PATH1 = "src/main/java/com/iotincpector/bankocr/resource/accountText_us1.txt";

    @Autowired
    ReadFromTxtFile readFromTxtFile;

    @GetMapping("/user-story1")
    public List<String> getDogList(){
        try {
            return readFromTxtFile.read(PATH1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
