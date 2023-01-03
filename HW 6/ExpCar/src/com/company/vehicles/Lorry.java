package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
    private int capacity;
    public Lorry (String modelCar, String classCar, int weightCar, int power, int performance,
                  String driverName, int driverExperience, int capacity ) {
        super(modelCar, classCar, weightCar, power, performance, driverName, driverExperience);
        this.capacity = capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void car () {
        System.out.println(toString() + " Грузоподъемность " + capacity + "кг");
    }
}
