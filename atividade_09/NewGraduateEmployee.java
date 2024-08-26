package atividade_09;

public class NewGraduateEmployee extends NewHighSchoolEmployee {
    private String university;

    public NewGraduateEmployee(String name, int employeeCode, String elementarySchool, String highSchool, String university, double commission) {
        super(name, employeeCode, elementarySchool, highSchool, commission);
        this.university = university;
    }

    @Override
    public double getBaseSalary() {
        return (super.getBaseSalary() * 2.00) + super.getCommission();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Universidade: " + university);
    }
}
