package org.homework1;

import java.util.List;

public class EmployeeService {
    private Database database = new Database();

    /**
     * Добавление нового сотрудника
     */
    public void newEmployee(Employee employee) {
        System.out.println("Добавлен новый сотрудник: ");
        System.out.println(employee);
        System.out.println();
        database.saveEmployee(employee);
    }

    /**
     * Вывод информации о всех сотрудниках
     */
    public void printEmployees() {
        List<Employee> employees = database.getEmployees();
        System.out.println("Все сотрудники:");
        employees.stream().forEach(System.out::println);
        System.out.println();
    }
}
