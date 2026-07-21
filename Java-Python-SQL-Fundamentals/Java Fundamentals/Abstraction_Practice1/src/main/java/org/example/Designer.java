package org.example;

public class Designer extends Employee {

    private String designTool;

    public Designer(String nameTag, String department, int tagId, String designTool) {

        super(nameTag, department, tagId);
        this.designTool = designTool;

    }

    @Override
    public void startWork() {

        System.out.println("Designer starts designing using  " + designTool + "\n");

    }

    @Override
    public void stopWork() {

        System.out.println("Designer closed all design files.");

    }

    public void createLogo() {

        System.out.println("Creating a new logo...");
    }


}//EOC
