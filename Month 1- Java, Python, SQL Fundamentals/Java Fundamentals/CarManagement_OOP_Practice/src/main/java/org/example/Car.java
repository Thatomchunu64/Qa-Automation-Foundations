package org.example;

public class Car {
    private String brand, model;
    private int yearReleased, speed;
    private boolean isEngineOn = false;

    //Constructor
    public Car(String brand, String model, int yearReleased, int speed) {

        //CONSTRUCTOR LOGIC
        this.brand = brand;
        this.yearReleased = yearReleased;
        this.model = model;
        this.speed = speed;

    }

    /* MY VERSION
    public void startEngine() {
        System.out.println("Engine Started...");
        isEngineOn = true;

        System.out.println("Engine already running");
    }

     */

    public void startEngine() {
        if (!isEngineOn) {
            System.out.println("Engine Started...");
            isEngineOn = true;
        } else {
            System.out.println("Engine already running");
        }
    }

    /* MY VERSION:
    public void accelerate() {
        if (isEngineOn) {
            speed = 10;
        } else {
            System.out.println("Error, Car not started");
        }
    }

     */

    public void accelerate() {
        if (isEngineOn) {
            speed += 10;
            System.out.println("Speed increased to: " + speed);
        } else {
            System.out.println("Error, car not started");
        }
    }

    /* MY VERSION
    public void stopEngine() {
        if (isEngineOn) {
            System.out.println("Cannot stop engine while moving");
        } else {
            speed = 0;
        }
    }
    */

    public void stopEngine() {
        if (isEngineOn) {
            if (speed == 0) {
                System.out.println("Engine stopped");
                isEngineOn = false;
            } else {
                System.out.println("Cannot stop engine while moving");
            }
        } else {
            System.out.println("Engine is already off");
        }
    }

    public String getCarInfo() {
        return "Vehicle Details: " + brand + " " + model + ", Released in: " + yearReleased + ", Engine: " + isEngineOn + ", Total Speed: " + speed + " km/h";
    }
}
