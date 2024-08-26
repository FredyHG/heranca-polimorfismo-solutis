package atividade_09;

public class TestCommissionByEducation {
    public static void main(String[] args) {
        EmployeeWithCommission manager = new NewManager("Carlos", 101);
        EmployeeWithCommission supervisor = new NewSupervisor("Ana", 102);
        EmployeeWithCommission salesperson = new NewSalesperson("Bob", 103);

        NewElementarySchoolEmployee elementaryEmployee = new NewElementarySchoolEmployee("Diana", 104, "ABC School", 150.0);
        NewHighSchoolEmployee highSchoolEmployee = new NewHighSchoolEmployee("Eve", 105, "DEF School", "XYZ School", 200.0);
        NewGraduateEmployee graduateEmployee = new NewGraduateEmployee("John", 106, "GHI School", "LMN School", "University of DEF", 500.0);

        manager.showInfo();
        System.out.println();
        supervisor.showInfo();
        System.out.println();
        salesperson.showInfo();
        System.out.println();
        elementaryEmployee.showInfo();
        System.out.println();
        highSchoolEmployee.showInfo();
        System.out.println();
        graduateEmployee.showInfo();
    }
}
