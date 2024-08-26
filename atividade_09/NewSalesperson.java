package atividade_09;

public class NewSalesperson extends EmployeeWithCommission {
    public NewSalesperson(String name, int employeeCode) {
        super(name, employeeCode, 250.0);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Cargo: sales");
    }

    @Override
    public String toString() {
        return super.toString() + ", Position: Salesperson";
    }
}
