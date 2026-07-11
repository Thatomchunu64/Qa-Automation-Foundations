package org.example;

public class Computer {

    private String brand, model;
    private int batteryBars, ramSize;
    private boolean ispoweredOn;

    public Computer(String brand, String model, int ramSize) {

        this.brand = brand;
        this.model = model;
        this.ramSize = ramSize;

        batteryBars = 100;
        ispoweredOn = false;
    }

    public void powerOn() {

        if (!ispoweredOn) {
            System.out.println("Computer powering on...");
            ispoweredOn = true;
        } else {
            System.out.println("Computer is already on.");
        }
    }

    public void openProgram(String progName) {

        if (ispoweredOn) {
            System.out.println("Launching " + progName);
            batteryBars = batteryBars - 5;
            System.out.println("Battery: " + batteryBars);
        } else {
            System.out.println("Cannot open programs. Computer is turned off.");
        }
    }

    public void chargeBattery() {
        if (batteryBars < 100) {
            batteryBars = 100;
            System.out.println("Computer fully charged.");
            System.out.println("Battery: "+batteryBars);
        } else {
            System.out.println("Battery is already full.");
        }
    }

    public void shutDown() {
        if (ispoweredOn) {
            System.out.println("2Shutting down computer...");
            ispoweredOn = false;
        } else {
            System.out.println("Computer is already off.");
        }
    }

    public String compinfo() {
        return "Computer Specs: \n" + brand +" "+ model +
                "\nRam: " + ramSize + "GB" +
                "\nPower: " + ispoweredOn +
                "\nBattery: " + batteryBars+
                "\n";
    }


}
