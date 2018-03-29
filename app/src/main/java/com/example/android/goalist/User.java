package com.example.android.goalist;

public class User {
    public String name;
    public String phoneNumber;
    public String about;

    public String email;
    public String avata;
    public Status status;
    public Message message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getEmail() { return email;}

    public void setEmail(String email) { this.email = email;}

    public User(String name, String phoneNumber, String about, String email){
        this.name = name;
        this.phoneNumber=phoneNumber;
        this.about=about;
        this.email=email;
    }

    public User(){
        status = new Status();
        message = new Message();
        status.isOnline = false;
        status.timestamp = 0;
        message.idReceiver = "0";
        message.idSender = "0";
        message.text = "";
        message.timestamp = 0;
    }


}
