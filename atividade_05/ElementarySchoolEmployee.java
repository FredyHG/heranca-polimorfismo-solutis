package atividade_05;

public class ElementarySchoolEmployee extends Employee {
    private String elementarySchool;

    public ElementarySchoolEmployee(String name, int employeeCode, String elementarySchool) {
        super(name, employeeCode);
        this.elementarySchool = elementarySchool;
    }

    @Override
    public double getBaseSalary() {
        return super.getBaseSalary() * 1.10;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Elementary School: " + elementarySchool);
    }
}
