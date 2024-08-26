package atividade_07;

import atividade_05.ElementarySchoolEmployee;
import atividade_05.Employee;
import atividade_05.GraduateEmployee;
import atividade_05.HighSchoolEmployee;

public class CompanySimulation {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new ElementarySchoolEmployee("Ana", 101, "ABC School");
        employees[1] = new ElementarySchoolEmployee("Bob", 102, "DEF School");
        employees[2] = new ElementarySchoolEmployee("Carlos", 103, "GHI School");
        employees[3] = new ElementarySchoolEmployee("Diana", 104, "JKL School");

        employees[4] = new HighSchoolEmployee("Eve", 105, "MNO School", "PQR School");
        employees[5] = new HighSchoolEmployee("Frank", 106, "STU School", "VWX School");
        employees[6] = new HighSchoolEmployee("Grace", 107, "YZA School", "BCD School");
        employees[7] = new HighSchoolEmployee("Henry", 108, "EFG School", "HIJ School");

        employees[8] = new GraduateEmployee("Ivy", 109, "KLM School", "NOP School", "QRS University");
        employees[9] = new GraduateEmployee("Jack", 110, "TUV School", "WXY School", "ZAB University");

        double totalSalaries = 0;
        double elementarySchoolCost = 0;
        double highSchoolCost = 0;
        double graduateSchoolCost = 0;

        for (Employee employee : employees) {
            double salary = employee.getBaseSalary();
            totalSalaries += salary;

            if (employee instanceof ElementarySchoolEmployee && !(employee instanceof HighSchoolEmployee)) {
                elementarySchoolCost += salary;
            } else if (employee instanceof HighSchoolEmployee && !(employee instanceof GraduateEmployee)) {
                highSchoolCost += salary;
            } else if (employee instanceof GraduateEmployee) {
                graduateSchoolCost += salary;
            }
        }

        System.out.println("Total salary cost for the company: $" + totalSalaries);
        System.out.println("Cost for elementary school employees: $" + elementarySchoolCost);
        System.out.println("Cost for high school employees: $" + highSchoolCost);
        System.out.println("Cost for graduate employees: $" + graduateSchoolCost);
    }
}
