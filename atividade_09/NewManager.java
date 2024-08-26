package atividade_09;

public class NewManager extends EmployeeWithCommission {
    public NewManager(String name, int employeeCode) {
        super(name, employeeCode, 1500.0);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Cargo: Gerente");
    }

    @Override
    public String toString() {
        return super.toString() + ", Position: Manager";
    }
}
