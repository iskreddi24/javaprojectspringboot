package com.example.restservice;

public class District {

    String districtName;

    public String getDistrictName () {
        return districtName;
    }

    public void setDistrictName (String districtName) {
        this.districtName = districtName;
    }

    @Override
    public String toString () {
        return "District{" +
                "districtName='" + districtName + '\'' +
                '}';
    }
}
