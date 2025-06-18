package com.example.restserviceex;

public class Details {
    private String coustmerName;
    private Family family;

    public String getCoustmerName () {
        return coustmerName;
    }

    public void setCoustmerName (String coustmerName) {
        this.coustmerName = coustmerName;
    }

    public Family getFamily () {
        return family;
    }

    public void setFamily (Family family) {
        this.family = family;
    }

    @Override
    public String toString () {
        return "Details{" +
                "coustmerName='" + coustmerName + '\'' +
                ", family=" + family +
                '}';
    }
}
