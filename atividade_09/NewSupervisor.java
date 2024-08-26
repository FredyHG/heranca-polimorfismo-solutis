package atividade_09;

public class NewSupervisor extends EmployeeWithCommission {
    public NewSupervisor(String name, int employeeCode) {
        super(name, employeeCode, 600.0);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Cargo: Supervisor");
    }

    @Override
    public String toString() {
        return super.toString() + ", Position: Supervisor";
    }
}
