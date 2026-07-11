package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SmartPhone dev1 = new SmartPhone("Samsung", "A26", 256);
        SmartPhone dev2 = new SmartPhone("Huawei", "P30 lite", 128);
        SmartPhone dev3 = new SmartPhone("iPhone", "15 PRO", 256);

        System.out.println(dev1.getPhoneInfo());
        System.out.println(dev2.getPhoneInfo());
        System.out.println(dev3.getPhoneInfo());

        dev1.powerOn();
        dev1.unlockPhone();
        dev1.openApp("Call of Duty mobile");
        dev1.chargePhone();
        dev1.lockPhone();
        dev1.powerOff();

    }

}