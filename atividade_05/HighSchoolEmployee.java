package atividade_05;

public class HighSchoolEmployee extends ElementarySchoolEmployee {
    private String highSchool;

    public HighSchoolEmployee(String name, int employeeCode, String elementarySchool, String highSchool) {
        super(name, employeeCode, elementarySchool);
        this.highSchool = highSchool;
    }

    @Override
    public double getBaseSalary() {
        return super.getBaseSalary() * 1.50;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("High School: " + highSchool);
    }
}
