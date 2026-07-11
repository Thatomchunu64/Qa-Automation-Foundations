package org.example;

public class Car extends Vechile{

    private int numberDoors;

    public Car(String brand, String model, int year, int numberDoors){

        super(brand, model, year);
        this.numberDoors=numberDoors;

    }//END OF CONSTRUCTOR

    public void openTrunk(){
        System.out.println("Opening trunk...");
    }

    public String getCarInfo() {
        return getVechileInfo() +
                " Doors: " + numberDoors+
                "\n";
    }

}//END OF CLASS
