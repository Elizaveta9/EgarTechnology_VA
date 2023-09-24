package org.homework1;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Employee> employees = new ArrayList<>();

    public Database() {
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

    public Employee findEmployeeById(int employeeId) {
        Employee foundEmployee = null;
        for (Employee employeeDB : employees) {
            if (employeeDB.getId() == employeeId) {
                foundEmployee = employeeDB;
            }
        }
        return foundEmployee;
    }
}
