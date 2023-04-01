package com.driver;

import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class WhatsappRepository {

    //Assume that each user belongs to at most one group
    //You can use the below mentioned hashmaps or delete these and create your own.
    private HashMap<Group, List<User>> groupUserMap;
    private HashMap<Group, List<Message>> groupMessageMap;
    private HashMap<Message, User> senderMap;
    private HashMap<Group, User> adminMap;
    private HashSet<String> userMobile;
    private int customGroupCount;
    private int messageId;
    private List<User> userDB;

    public WhatsappRepository(){
        this.groupMessageMap = new HashMap<Group, List<Message>>();
        this.groupUserMap = new HashMap<Group, List<User>>();
        this.senderMap = new HashMap<Message, User>();
        this.adminMap = new HashMap<Group, User>();
        this.userMobile = new HashSet<>();
        this.customGroupCount = 0;
        this.messageId = 0;
    }

    public void createUser(String name, String mobile) {
        //If the mobile number exists in database, throw "User already exists" exception
        //Otherwise, create the user and return "SUCCESS"
        User newUser = new User(name, mobile);
        userDB.add(newUser);
    }

//    public HashSet<String> getAllUserMobiles() {
//        return nurseDB.values().stream().toList();
//    }


    public List<User> getUserDB() {
        return userDB;
    }

    public HashMap<Group, List<User>> getGroupUserMap() {
        return groupUserMap;
    }

    public HashMap<Group, List<Message>> getGroupMessageMap() {
        return groupMessageMap;
    }

    public HashMap<Message, User> getSenderMap() {
        return senderMap;
    }

    public HashMap<Group, User> getAdminMap() {
        return adminMap;
    }

    public HashSet<String> getUserMobile() {
        return userMobile;
    }

    public int getCustomGroupCount() {
        return customGroupCount;
    }

    public int getMessageId() {
        return messageId;
    }
}
