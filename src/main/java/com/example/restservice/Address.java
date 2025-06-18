package com.example.restservice;

public class Address {
    private String houseNo;
    private String streetName;
    private String cityName;

    public String getHouseNo () {
        return houseNo;
    }

    public void setHouseNo (String houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreetName () {
        return streetName;
    }

    public void setStreetName (String streetName) {
        this.streetName = streetName;
    }

    public String getCityName () {
        return cityName;
    }

    public void setCityName (String cityName) {
        this.cityName = cityName;
    }

    public State getState () {
        return state;
    }

    public void setState (State state) {
        this.state = state;
    }

    private State state;

    @Override
    public String toString () {
        return "Address{" +
                "houseNo='" + houseNo + '\'' +
                ", streetName='" + streetName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", state=" + state +
                '}';
    }
}
