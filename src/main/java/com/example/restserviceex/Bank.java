package com.example.restserviceex;

public class Bank {
    private Details details;
    private Addresss addresss;
    private Contacts contacts;
    private LoanDetails loanDetails;

    public LoanDetails getLoanDetails () {
        return loanDetails;
    }

    public void setLoanDetails (LoanDetails loanDetails) {
        this.loanDetails = loanDetails;
    }

    public Details getDetails () {
        return details;
    }

    public void setDetails (Details details) {
        this.details = details;
    }

    public Addresss getAddresss () {
        return addresss;
    }

    public void setAddresss (Addresss addresss) {
        this.addresss = addresss;
    }

    public Contacts getContacts () {
        return contacts;
    }

    public void setContacts (Contacts contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString () {
        return "Bank{" +
                "details=" + details +
                ", addresss=" + addresss +
                ", contacts=" + contacts +
                ", loanDetails=" + loanDetails +
                '}';
    }
}
