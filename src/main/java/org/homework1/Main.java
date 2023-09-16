package org.homework1;

public class Main {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();

        service.printEmployees();
        service.newEmployee(new Employee("Авраам", "Авраамов", "повар"));
        service.printEmployees();

    }
}
