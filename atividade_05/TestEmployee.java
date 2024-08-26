package atividade_05;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Carlos", 101);
        ElementarySchoolEmployee employee2 = new ElementarySchoolEmployee("Ana", 102, "ABC School");
        HighSchoolEmployee employee3 = new HighSchoolEmployee("John", 103, "DEF School", "GHI School");
        GraduateEmployee employee4 = new GraduateEmployee("Mary", 104, "JKL School", "MNO School", "XYZ University");

        employee1.showInfo();
        System.out.println();
        employee2.showInfo();
        System.out.println();
        employee3.showInfo();
        System.out.println();
        employee4.showInfo();
    }
}
