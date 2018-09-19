package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Car theCar = null;
        CarFactory carFactory = new CarFactory();
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "What type of car is to be created?"
                        +"\nE - Electric Car"
                        +"\nP - Petrol Car"
                        +"\nD - Diesel Car");

        if(scanner.hasNextLine()){
            String typeOfCar = scanner.nextLine();
            theCar = carFactory.makeCar(typeOfCar);
        }

        if(theCar != null){
            doCarStuff(theCar);
        } else System.out.println("\nUnknown car type!");
    }

    public static void doCarStuff(Car car){
        car.driveCar();
        car.loadCar(37);
    }
}
