<<<<<<< HEAD
package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    private int speedLimit;
    public SportCar (String modelCar, String classCar, int weightCar, int power, int performance,
                     String driverName, int driverExperience, int speedLimit ) {
        super(modelCar, classCar, weightCar, power, performance, driverName, driverExperience);
        this.speedLimit = speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    @Override
    public void car () {
        System.out.println(toString() + " Предельная скорость " + speedLimit + "км/час");
    }
}


=======
package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    private int speedLimit;
    public SportCar (String modelCar, String classCar, int weightCar, int power, int performance,
                     String driverName, int driverExperience, int speedLimit ) {
        super(modelCar, classCar, weightCar, power, performance, driverName, driverExperience);
        this.speedLimit = speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    @Override
    public String toString() {
        return toString() + " Предельная скорость " + speedLimit + "км/с";
    }
}


>>>>>>> e075fa62645bc84c07d21ae6cd3654cd011cce1d
