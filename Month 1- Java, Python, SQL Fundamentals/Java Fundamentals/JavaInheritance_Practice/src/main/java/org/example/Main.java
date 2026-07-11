package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", "M5 Competition", 2024, 4);
        Car car2 = new Car("Nissan", "GTR SKYLINE", 2015, 2);

        System.out.println(car1.getVechileInfo());
        System.out.println(car1.getCarInfo());
        System.out.println(car2.getVechileInfo());
        System.out.println(car2.getCarInfo());

        car1.openTrunk();
        car1.startEngine();
        car1.stopEngine();
        System.out.println();

        Bike cycle1 = new Bike("Mitsubishi", "CX234", 2011, true);
        Bike cycle2 = new Bike("Ducatti", "D43-32", 2025, false);


        System.out.println(cycle1.getVechileInfo());
        System.out.println(cycle2.getVechileInfo());

        cycle1.startEngine();
        cycle1.popWheelie();
        cycle1.stopEngine();


    }
}