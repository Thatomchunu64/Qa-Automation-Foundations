package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Thato Sedibang", 567359);
        BankAccount acc2 = new BankAccount("Lucky Mkhize", 977382);
        BankAccount acc3 = new BankAccount("Thabiso Sokhela", 358460);

        //Account Details
        System.out.println(acc1.accInfo());
        System.out.println(acc2.accInfo());
        System.out.println(acc3.accInfo());

        //Other methods
        acc1.deposit(6000);
        acc1.deposit(-6999);
        acc1.withdraw(8000);
        acc1.withdraw(2000);
        acc1.withdraw(-500);
        acc1.freezeAcc();
        acc1.activateAcc();

        System.out.println(acc1.accInfo());


    }
}