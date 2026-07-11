package org.example;

public class Vechile {

    protected String brand, model;
    protected int year;

    public Vechile(String Brand, String Model, int Year){
        this.brand=Brand;
        this.model=Model;
        this.year=Year;


    }


    public void startEngine(){
        System.out.println("Engine started.");
    }

    public void stopEngine(){
        System.out.println("Engine stopped.");
    }

    public String getVechileInfo(){

        return "Vechile details: \n "+
                "Brand: "+brand+
                "\n Model: "+model+
                "\n Release Year: "+ year+
                "\n";


    }


}//END OF CLASS
