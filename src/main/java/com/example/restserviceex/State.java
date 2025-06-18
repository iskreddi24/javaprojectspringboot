package com.example.restserviceex;

public class State {
    private String stateName;
    private int stateCode;

    public String getStateName () {
        return stateName;
    }

    public void setStateName (String stateName) {
        this.stateName = stateName;
    }

    public int getStateCode () {
        return stateCode;
    }

    public void setStateCode (int stateCode) {
        this.stateCode = stateCode;
    }

    @Override
    public String toString () {
        return "State{" +
                "stateName='" + stateName + '\'' +
                ", stateCode=" + stateCode +
                '}';
    }
}
