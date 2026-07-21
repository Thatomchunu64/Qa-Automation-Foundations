package org.example;

public abstract class Employee {

    private String name, department;
    private int employeeId;


    public Employee(String name, String department, int emloyeeId) {

        this.name = name;
        this.department = department;
        this.employeeId = emloyeeId;

    }

    public String getEmployeeInfo() {
        return "Employee Info: \n" +
                "Name: " + name +
                "\nID: " + employeeId +
                "\nDepartment: " + department +
                "\n";

    }


    public abstract void startWork();

    public abstract void stopWork();


}//END OF CLASS
