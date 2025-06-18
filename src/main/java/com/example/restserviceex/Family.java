package com.example.restserviceex;

public class Family {
    private String fatherName;
    private String motherName;
    private MartialStatus martialStatus;

    public String getFatherName () {
        return fatherName;
    }

    public void setFatherName (String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName () {
        return motherName;
    }

    public void setMotherName (String motherName) {
        this.motherName = motherName;
    }

    public MartialStatus getMartialStatus () {
        return martialStatus;
    }

    public void setMartialStatus (MartialStatus martialStatus) {
        this.martialStatus = martialStatus;
    }

    @Override
    public String toString () {
        return "Family{" +
                "fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", martialStatus=" + martialStatus +
                '}';
    }
}
