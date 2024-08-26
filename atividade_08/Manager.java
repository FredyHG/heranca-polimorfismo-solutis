package atividade_08;

import atividade_05.Employee;

public class Manager extends Employee {

    private double commission = 1500;

    public Manager(String name, int employeeCode) {
        super(name, employeeCode);
    }

    @Override
    public double getBaseSalary() {
        return super.getBaseSalary() + commission;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Position: Manager");
        System.out.println("Commission: $" + commission);
    }

}
