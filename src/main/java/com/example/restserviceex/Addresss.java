package com.example.restserviceex;

public class Addresss {
    private String houseNo;
    private String streetName;
    private String village;
    private String district;
    private State state;

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

    public String getVillage () {
        return village;
    }

    public void setVillage (String village) {
        this.village = village;
    }

    public String getDistrict () {
        return district;
    }

    public void setDistrict (String district) {
        this.district = district;
    }

    public State getState () {
        return state;
    }

    public void setState (State state) {
        this.state = state;
    }

    @Override
    public String toString () {
        return "Addresss{" +
                "houseNo='" + houseNo + '\'' +
                ", streetName='" + streetName + '\'' +
                ", village='" + village + '\'' +
                ", district='" + district + '\'' +
                ", state=" + state +
                '}';
    }
}
