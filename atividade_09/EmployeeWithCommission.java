package atividade_09;

public abstract class EmployeeWithCommission {
    private String name;
    private int employeeCode;
    private double baseSalary = 1000.0;
    private double commission;

    public EmployeeWithCommission(String name, int employeeCode, double commission) {
        this.name = name;
        this.employeeCode = employeeCode;
        this.commission = commission;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getCommission() {
        return commission;
    }

    public double getSalary() {
        return baseSalary + commission;
    }

    public void showInfo() {
        System.out.println("Nome: " + name);
        System.out.println("Código Funcional: " + employeeCode);
        System.out.println("Salário Base: R$" + baseSalary);
        System.out.println("Comissão: R$" + commission);
        System.out.println("Salário Total: R$" + getSalary());
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Commission: R$%.2f, Total Salary: R$%.2f",
                name, commission, getSalary());
    }
}
