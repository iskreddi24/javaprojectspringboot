package com.example.restservice;

public class Contact {
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

    public String getSocialMedia () {
        return socialMedia;
    }

    public void setSocialMedia (String socialMedia) {
        this.socialMedia = socialMedia;
    }

    private String socialMedia;

    @Override
    public String toString () {
        return "Contact{" +
                "email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", socialMedia='" + socialMedia + '\'' +
                '}';
    }
}
