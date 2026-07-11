package org.example;

public class SmartPhone {
    private String brand, model;
    private int cellStorage, batteryBars;
    private boolean isPoweredOn, isLocked;


    //Constructor
    public SmartPhone(String Brand, String Model, int Storage) {

        this.brand = Brand;
        this.model = Model;
        this.cellStorage = Storage;

        batteryBars = 100;
        isPoweredOn = false;
        isLocked = true;

    }//END OF CONSTRUCTOR

    //METHOD 1
    public void powerOn() {
        if (isPoweredOn) {
            System.out.println("Phone is already on.");
        } else {
            System.out.println("Powering on...");
            isPoweredOn = true;

        }


    }//end of method 1

    //METHOD 2
    public void powerOff() {
        if (!isPoweredOn) {
            System.out.println("Phone is already off.");
            return;
        }

        if (!isLocked) {
            System.out.println("Lock the phone before powering off.");
            return;
        }


        System.out.println("Powering off...");
        isPoweredOn = false;


    }//END OF METHOD 2

    //Method 3
    public void unlockPhone() {

        if (!isPoweredOn) {
            System.out.println("Turn the phone on first.");
            return;
        }

        if (!isLocked) {
            System.out.println("Phone is already unlocked.");

        } else {
            System.out.println("Phone unlocked.");
            isLocked = false;
        }
    }//END OF METHOD 3

    //METHOD 4
    public void lockPhone() {
        if (!isPoweredOn) {
            System.out.println("Phone is already off.");
            return;
        }

        if (isLocked) {
            System.out.println("Phone is already locked.");
        } else {
            System.out.println("Phone locked.");
            isLocked = true;
        }
    }//END OF METHOD 4

    //METHOD 5
    public void openApp(String appName) {
        if (!isPoweredOn) {
            System.out.println("Turn the phone on first.");
            return;
        }

        if (isLocked) {
            System.out.println("Unlock the phone first.");
            return;
        }

        System.out.println("Opening " + appName + " ...");
        batteryBars -= 2;
        System.out.println("Battery: " + batteryBars + "%");

    }//END OF METHOD 5

    //METHOD 6
    public void chargePhone() {
        if(!isPoweredOn) {
            System.out.println("Phone gets to be on to check percentage");
        }else {
            if (batteryBars >= 100) {
                System.out.println("Battery already full.");
            } else {
                batteryBars = 100;
                System.out.println("Charging complete.");
            }
        }

    }//END OF METHOD 6

    //METHOD 7
    public String getPhoneInfo() {

        return "Device Specifications: \n" +
                "Brand: " + brand +
                "\nModel: " + model +
                "\nStorage: " + cellStorage + " GB"+
                "\nBattery: " + batteryBars + " %" +
                "\nPower: " + isPoweredOn +
                "\nLocked: " + isLocked +
                "\n";

    }//END OF METHOD 7

}//End of CLASS
