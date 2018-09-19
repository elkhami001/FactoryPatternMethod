package com.company;

public abstract class Car {

    private String name;
    private int capacity;

    public void driveCar(){
        System.out.println(
                    getName()
                    + " is on the road with and can drive "
                    + calcRange(getCapacity())
                    + " kilometres.");
    }

    public void loadCar(int capacity){
        System.out.print(
                getName()
                    + " capacity increased from \n"
                    + getCapacity()
                    + " to ");
        setCapacity(capacity + getCapacity());
        System.out.print(
                    getCapacity()
                    + " and has a range of "
                    + calcRange(getCapacity())
                    + " kilometres.");
    }

    public int calcRange(int capacity){
        int range = capacity * efficiency;
        return range;
    }

    public int getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }

    private int efficiency;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
