package com.kodilla.good.patterns.challenges.ProductOrderService;

public class User {
    private String username;
    private String firstName;
    private String familyName;
    private String adress;
    private String emailAdress;
    private String phoneNumber;

    public User(String username, String firstName, String familyName,
                String adress, String emailAdress, String phoneNumber) {
        this.username = username;
        this.firstName = firstName;
        this.familyName = familyName;
        this.adress = adress;
        this.emailAdress = emailAdress;
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getAdress() {
        return adress;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
