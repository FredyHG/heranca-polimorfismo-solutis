package atividade_08;

import atividade_05.Employee;

public class Supervisor extends Employee {

    private double commission = 600.0;

    public Supervisor(String name, int employeeCode) {
        super(name, employeeCode);
    }

    @Override
    public double getBaseSalary() {
        return super.getBaseSalary() + commission;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Position: Supervisor");
        System.out.println("Commission: $" + commission);
    }

}
