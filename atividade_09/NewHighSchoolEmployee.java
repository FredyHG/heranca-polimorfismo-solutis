package atividade_09;

public class NewHighSchoolEmployee extends NewElementarySchoolEmployee {
    private String highSchool;

    public NewHighSchoolEmployee(String name, int employeeCode, String elementarySchool, String highSchool, double commission) {
        super(name, employeeCode, elementarySchool, commission);
        this.highSchool = highSchool;
    }

    @Override
    public double getBaseSalary() {
        return (super.getBaseSalary() * 1.50) + super.getCommission();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Ensino Médio: " + highSchool);
    }
}
