package com.example.restserviceex;

public class MartialStatus {
    private String statusOfCoustmer;

    public String getStatusOfCoustmer () {
        return statusOfCoustmer;
    }

    public void setStatusOfCoustmer (String statusOfCoustmer) {
        this.statusOfCoustmer = statusOfCoustmer;
    }

    @Override
    public String toString () {
        return "MartialStatus{" +
                "statusOfCoustmer='" + statusOfCoustmer + '\'' +
                '}';
    }
}
