package com.example.restservice;

public class Education {
    private int sscPercentage;
    private int interPercentage;
    private int btechPercentage;

    public int getSscPercentage () {
        return sscPercentage;
    }

    public void setSscPercentage (int sscPercentage) {
        this.sscPercentage = sscPercentage;
    }

    public int getInterPercentage () {
        return interPercentage;
    }

    public void setInterPercentage (int interPercentage) {
        this.interPercentage = interPercentage;
    }

    public int getBtechPercentage () {
        return btechPercentage;
    }

    public void setBtechPercentage (int btechPercentage) {
        this.btechPercentage = btechPercentage;
    }

    @Override
    public String toString () {
        return "Education{" +
                "sscPercentage=" + sscPercentage +
                ", interPercentage=" + interPercentage +
                ", btechPercentage=" + btechPercentage +
                '}';
    }
}
