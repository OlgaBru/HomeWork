package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String modelCar;
    private String classCar;
    private int weightCar;

    Engine engine = new Engine();
    private int power = engine.power;
    private int performance = engine.performance;

    Driver driver = new Driver();
    private String driverName = driver.driverName;
    private int driverExperience = driver.driveExperience;

    public Car() {
    }

    public Car(String modelCar, String classCar, int weightCar, int power, int performance,
               String driverName, int driverExperience) {
        this.modelCar = modelCar;
        this.classCar = classCar;
        this.weightCar = weightCar;
        this.power = power;
        this.performance = performance;
        this.driverName = driverName;
        this.driverExperience = driverExperience;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setClassCar(String classCar) {
        this.classCar = classCar;
    }

    public String getClassCar() {
        return classCar;
    }

    public void setWeightCar(int weightCar) {
        this.weightCar = weightCar;
    }

    public int getWeightCar() {
        return weightCar;
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

        public void start () {
            System.out.println("Поехали");
        }

        public void stop () {
            System.out.println("Останавливаемся");
        }

        public void turnRight () {
            System.out.println("Поворот направо");
        }

        public void turnLeft () {
            System.out.println("Поворот налево");
        }

        public void car() {
        System.out.println(toString());
        }

        @Override //переопределение м-да,т.к. все классы наследуются от классса Object
        public String toString () {
            return  " Марка авто: " + modelCar +
                    " Класс: " + classCar +
                    " Вес: " + weightCar + "кг" +
                    " Мощность: " + power + "кВт" +
                    " Производительность: " + performance + "л.с." +
                    " ФИО водителя: " + driverName +
                    " Стаж работы: " + driverExperience + "лет";
        }
    }



