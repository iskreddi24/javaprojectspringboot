package com.example.restserviceex;

public class Contacts {
    private String email;
    private int phoneNumber;

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public int getPhoneNumber () {
        return phoneNumber;
    }

    public void setPhoneNumber (int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString () {
        return "Contacts{" +
                "email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
