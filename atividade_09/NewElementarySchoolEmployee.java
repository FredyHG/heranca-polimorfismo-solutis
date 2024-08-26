package atividade_09;

public class NewElementarySchoolEmployee extends EmployeeWithCommission {
    private String elementarySchool;

    public NewElementarySchoolEmployee(String name, int employeeCode, String elementarySchool, double commission) {
        super(name, employeeCode, commission);
        this.elementarySchool = elementarySchool;
    }

    @Override
    public double getSalary() {
        return (super.getBaseSalary() * 1.10) + super.getCommission();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Escola Primária: " + elementarySchool);
    }
}
