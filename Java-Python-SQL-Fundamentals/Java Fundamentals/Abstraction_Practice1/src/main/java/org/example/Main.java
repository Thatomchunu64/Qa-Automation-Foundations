package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Developer dev = new Developer("Andrew", "QA testing", 690, "C++");

        System.out.println(dev.getEmployeeInfo());
        dev.startWork();
        dev.debugCode();
        dev.stopWork();

        System.out.println("\n-------------------------------------------------------------------------------\n");

        Designer designer = new Designer("Jake", "3D Graphic design", 933, "Framer Motion");

        System.out.println(designer.getEmployeeInfo());
        designer.startWork();
        designer.createLogo();
        designer.stopWork();


    }
}