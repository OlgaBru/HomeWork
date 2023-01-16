package com.company.professions;

public class Driver {
    public String driverName;
    public int driverExperience;

    public Driver() {
    }

    public Driver (String driverName, int driverExperience) {
        this.driverName = driverName;
        this.driverExperience = driverExperience;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    public String getDriverName() {
        return driverName;
    }

    public void setDriverExperience(int driverExperience) {
        this.driverExperience = driverExperience;
    }
    public int getDriverExperience() {
        return driverExperience;
    }
}


