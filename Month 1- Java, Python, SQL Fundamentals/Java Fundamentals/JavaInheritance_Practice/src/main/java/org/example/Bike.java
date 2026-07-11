package org.example;


public class Bike extends Vechile {

    private boolean hasHelmetBox;

    //Constructor
    public Bike(String brand, String model, int year, boolean hasHelmetBox){
        super(brand, model, year);
        this.hasHelmetBox=hasHelmetBox;

    }

    public void popWheelie(){
        if (hasHelmetBox) {
            System.out.println("Careful! Helmet box attached.");
        }else{
            System.out.println("Doing a wheelie!");
        }
    }




}//END OF CLASS
