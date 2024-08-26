package atividade_08;

import atividade_05.Employee;

public class Salesperson extends Employee {
    private double commission = 250.0;

    public Salesperson(String name, int employeeCode) {
        super(name, employeeCode);
    }

    @Override
    public double getBaseSalary() {
        return super.getBaseSalary() + commission;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Position: Salesperson");
        System.out.println("Commission: $" + commission);
    }

}
