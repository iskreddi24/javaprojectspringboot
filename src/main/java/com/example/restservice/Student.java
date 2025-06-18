package com.example.restservice;

public class Student {
    private Address address;
    private Contact contact;

    public Address getAddress () {
        return address;
    }

    public void setAddress (Address address) {
        this.address = address;
    }

    public Contact getContact () {
        return contact;
    }

    public void setContact (Contact contact) {
        this.contact = contact;
    }

    public Education getEducation () {
        return education;
    }

    public void setEducation (Education education) {
        this.education = education;
    }

    private Education education;
    @Override
    public String toString() {
        return "Student{" +
                "address=" + address +
                ", contact=" + contact +
                ", education=" + education +
                '}';
    }

}
