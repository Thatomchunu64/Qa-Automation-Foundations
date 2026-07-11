package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Computer pc1 = new Computer("Asus", "Vivobook 15", 8);
        Computer pc2 = new Computer("Huawei", "Matebook 15", 8);
        Computer pc3 = new Computer("Lenovo", "Ideapad 10", 16);

        System.out.println(pc1.compinfo());
        System.out.println(pc2.compinfo());
        System.out.println(pc3.compinfo());

        pc1.powerOn();
        pc1.openProgram("Chrome");
        pc1.chargeBattery();
        pc1.shutDown();




    }
}