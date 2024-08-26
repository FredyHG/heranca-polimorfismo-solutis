package atividade_05;

public class GraduateEmployee extends HighSchoolEmployee{
    private String university;

    public GraduateEmployee(String name, int employeeCode, String elementarySchool, String highSchool, String university) {
        super(name, employeeCode, elementarySchool, highSchool);
        this.university = university;
    }

    @Override
    public double getBaseSalary() {
        return super.getBaseSalary() * 2.00;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("University: " + university);
    }
}
