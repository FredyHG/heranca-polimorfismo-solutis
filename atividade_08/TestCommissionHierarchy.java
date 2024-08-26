package atividade_08;

import atividade_05.Employee;

public class TestCommissionHierarchy {
    public static void main(String[] args) {
        Employee manager = new Manager("Carlos", 101);
        Employee supervisor = new Supervisor("Ana", 102);
        Employee salesperson = new Salesperson("Bob", 103);

        manager.showInfo();
        System.out.println();
        supervisor.showInfo();
        System.out.println();
        salesperson.showInfo();
    }
}
