package com.driver;

import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class WhatsappService {

    WhatsappRepository whatsappRepository = new WhatsappRepository();

    public String createUser(String name, String mobile) throws Exception {
        //If the mobile number exists in database, throw "User already exists" exception
        //Otherwise, create the user and return "SUCCESS"
        if(whatsappRepository.getUserMobile().contains(mobile)) {
            throw new Exception("User already exists");
        } else {
            whatsappRepository.createUser(name, mobile);
            return "SUCCESS";
        }
    }
}
