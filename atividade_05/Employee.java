package atividade_05;

public class Employee {
    private String name;
    private int employeeCode;
    private double baseSalary = 1000.0;

    public Employee(String name, int employeeCode) {
        this.name = name;
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Employee Code: " + employeeCode);
        System.out.println("Salary: $" + getBaseSalary());
    }
}
