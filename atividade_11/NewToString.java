package atividade_11;

import atividade_09.EmployeeWithCommission;
import atividade_09.NewManager;
import atividade_09.NewSalesperson;
import atividade_09.NewSupervisor;

public class NewToString {
    public static void main(String[] args) {
        EmployeeWithCommission[] employees = new EmployeeWithCommission[10];

        employees[0] = new NewManager("Carlos", 1);

        employees[1] = new NewSupervisor("Ana", 2);
        employees[2] = new NewSupervisor("Eva", 3);

        employees[3] = new NewSalesperson("Bob", 4);
        employees[4] = new NewSalesperson("Charlie", 5);
        employees[5] = new NewSalesperson("Diana", 6);
        employees[6] = new NewSalesperson("Frank", 7);
        employees[7] = new NewSalesperson("Grace", 8);
        employees[8] = new NewSalesperson("Hannah", 9);
        employees[9] = new NewSalesperson("Ian", 10);

        for (EmployeeWithCommission employee : employees) {
            System.out.println(employee);
        }
    }
}
