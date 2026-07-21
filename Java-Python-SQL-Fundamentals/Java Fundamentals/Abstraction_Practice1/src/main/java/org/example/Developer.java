package org.example;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String nameTag, String department, int tagId, String programLanguage) {

        super(nameTag, department, tagId);
        this.programmingLanguage = programLanguage;

    }

    @Override
    public void startWork() {

        System.out.println("Developer starts coding in " + programmingLanguage + "\n");

    }

    @Override
    public void stopWork() {

        System.out.println("Developer saved the project and stopped working.");

    }

    public void debugCode() {

        System.out.println("Debugging application...");

    }


}//END OF CLASS
