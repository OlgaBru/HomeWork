package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String modelCar;
    private String classCar;
    private int weightCar;

    Engine engine = new Engine();

    Driver driver = new Driver();

    public Car() {
    }

    public Car(String modelCar, String classCar, int weightCar, int power, int performance,
               String driverName, int driverExperience) {
        this.modelCar = modelCar;
        this.classCar = classCar;
        this.weightCar = weightCar;
        this.engine.power = power;
        this.engine.performance = performance;
        this.driver.driverName = driverName;
        this.driver.driverExperience = driverExperience;
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
                    " Мощность: " + engine.power + "кВт" +
                    " Производительность: " + engine.performance + "л.с." +
                    " ФИО водителя: " + driver.driverName +
                    " Стаж работы: " + driver.driverExperience + "лет";
        }
    }



