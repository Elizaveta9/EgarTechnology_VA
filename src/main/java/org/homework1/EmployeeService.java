package org.homework1;

import java.util.Calendar;
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

    /**
     * Вывод информации об отработанном времени конкретного сотрудника
     */
    public void printWorkHistory(int employeeId) {
        Employee employee = database.findEmployeeById(employeeId);
        System.out.println("Отработанные дни сотрудника (" + employee + "):");
        employee.getWorkHistory().stream().forEach(System.out::println);
        System.out.println();
    }

    /**
     * Добавление записи об отработанном дне конкретному сотрунику
     */
    public void addWorkDay(int employeeId, int hoursWorked, String absenceReason, Calendar date) {
        Employee employee = database.findEmployeeById(employeeId);
        List<WorkDay> workDays = employee.getWorkHistory();
        workDays.add(new WorkDay(hoursWorked, absenceReason, date));
        employee.setWorkHistory(workDays);
    }

    /**
     * Добавление паспорта в список документов сотрудника
     */
    public void addPassport(int employeeId, String passportNumber, String address, String whoGave) {
        Employee employee = database.findEmployeeById(employeeId);
        List<Document> documents = employee.getDocuments();
        documents.add(new Passport(passportNumber, employee.getFirstName(), employee.getSurname(), address, whoGave));
        employee.setDocuments(documents);
    }

    /**
     * Добавление трудовой книжки в список документов сотрудника
     */
    public void addEmploymentBook(int employeeId, String employmentBookNumber, String employmentHistory) {
        Employee employee = database.findEmployeeById(employeeId);
        List<Document> documents = employee.getDocuments();
        documents.add(new EmploymentBook(employmentBookNumber, employee.getFirstName(), employee.getSurname(), employmentHistory));
        employee.setDocuments(documents);
    }

    /**
     * Вывод информации о документах конкретного сотрудника
     */
    public void printDocuments(int employeeId) {
        Employee employee = database.findEmployeeById(employeeId);
        System.out.println("Документы сотрудника (" + employee + "):");
        employee.getDocuments().stream().forEach(System.out::println);
    }
}
