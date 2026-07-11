package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book read1 = new Book("ACE", "Ace Ventura", "Documentary", 2009);
        Book read2 = new Book("Spies", "Larry Vena", "Action", 2023);
        Book read3 = new Book("Jigga Maroo", "lex lura", "Sci-FI", 2014);

        System.out.println(read1.getBookInfo());
        System.out.println(read2.getBookInfo());
        System.out.println(read3.getBookInfo());

        read1.readBook();
        read1.borrowBook();
        read1.returnBook();


    }
}