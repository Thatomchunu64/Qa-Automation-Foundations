package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car car1= new Car("BMW","I8",2006, 190);
        car1.startEngine();
        car1.accelerate();
        car1.stopEngine();

        Car car2= new Car("Toyota","Supra",2012, 180);
        car2.startEngine();
        car2.accelerate();
        car2.stopEngine();
        Car car3= new Car("Nissan","GTR-R35",2003, 260);
        car3.startEngine();
        car3.accelerate();
        car3.stopEngine();

        System.out.println(car1.getCarInfo());
        System.out.println(car2.getCarInfo());
        System.out.println(car3.getCarInfo());

    }
}