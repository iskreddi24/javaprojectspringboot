package com.example.restservice;

public class State extends District{

    private String stateName;
    private String stateCOde;

    public String getStateName () {
        return stateName;
    }

    public void setStateName (String stateName) {
        this.stateName = stateName;
    }

    public String getStateCOde () {
        return stateCOde;
    }

    public void setStateCOde (String stateCOde) {
        this.stateCOde = stateCOde;
    }

    @Override
    public String toString () {
        return "State{" +
                "stateName='" + stateName + '\'' +
                ", stateCOde='" + stateCOde + '\'' +
                ", districtName='" + districtName + '\'' +
                '}';
    }
}
