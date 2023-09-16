package org.homework1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();

        service.printEmployees();
        service.newEmployee(new Employee("Авраам", "Авраамов", "повар"));
        service.newEmployee(new Employee("Иван", "Иванов", "оператор"));
        service.newEmployee(new Employee("Петр", "Петров", "монтажник"));
        service.newEmployee(new Employee("Кирилл", "Кириллов", "слесарь"));
        service.printEmployees();
        service.addWorkDay(0, 8, "явка", new GregorianCalendar(2023, Calendar.SEPTEMBER, 3));
        service.addWorkDay(0, 8, "явка", new GregorianCalendar(2023, Calendar.SEPTEMBER, 4));
        service.addWorkDay(0, 0, "больничный", new GregorianCalendar(2023, Calendar.SEPTEMBER, 5));
        service.printWorkHistory(0);
    }
}
