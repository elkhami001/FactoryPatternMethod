package com.company;

public class CarFactory {
    public Car makeCar(String newCarType){
        Car newCar = null;

        if(newCarType.equals("E")){
            return new ElectricCar();
        } else
        if(newCarType.equals("D")){
            return new DieselCar();
        }else
        if(newCarType.equals("P")){
            return new PetrolCar();
        }else return null;
    }
}
