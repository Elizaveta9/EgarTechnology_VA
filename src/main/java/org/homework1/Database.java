package org.homework1;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Employee> employees;

    public Database() {
        employees = new ArrayList<>();
        employees.add(new Employee("Иван", "Иванов", "оператор"));
        employees.add(new Employee("Петр", "Петров", "монтажник"));
        employees.add(new Employee("Кирилл", "Кириллов", "слесарь"));
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void saveEmployee(Employee employee) {
        employees.add(employee);
    }
}
