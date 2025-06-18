package com.example.restserviceex;

public class LoanDetails {
    private int goldLoan;
    private int houseLoan;

    public int getGoldLoan () {
        return goldLoan;
    }

    public void setGoldLoan (int goldLoan) {
        this.goldLoan = goldLoan;
    }

    public int getHouseLoan () {
        return houseLoan;
    }

    public void setHouseLoan (int houseLoan) {
        this.houseLoan = houseLoan;
    }

    public int getCarLoan () {
        return carLoan;
    }

    public void setCarLoan (int carLoan) {
        this.carLoan = carLoan;
    }

    private int carLoan;

    @Override
    public String toString () {
        return "LoanDetails{" +
                "goldLoan=" + goldLoan +
                ", houseLoan=" + houseLoan +
                ", carLoan=" + carLoan +
                '}';
    }
}
