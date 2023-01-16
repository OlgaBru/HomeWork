package com.company.details;

public class Engine {
    public int power; //private  другом пакете ( в котором нах.Car) не увидит
    public int performance;

    public Engine () {
    }

    public Engine (int power, int performance) {
        this.power = power;
        this.performance = performance;
    }

    public void setPower(int power) {
        this.power = power;
    }
    public int getPower() {
        return power;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }
    public int getPerformance() {
        return performance;
    }
}
