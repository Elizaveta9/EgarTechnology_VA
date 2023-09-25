package org.homework1;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();

        service.printEmployees();
        service.newEmployee(new Employee("Авраам", "Авраамов", "повар"));
        service.newEmployee(new Employee("Иван", "Иванов", "оператор"));
        service.newEmployee(new Employee("Петр", "Петров", "монтажник"));
        service.newEmployee(new Employee("Кирилл", "Кириллов", "слесарь"));
        service.printEmployees();
        service.addWorkDay(0, 8, "явка", LocalDate.of(2023, Month.SEPTEMBER, 12));
        service.addWorkDay(0, 8, "явка", LocalDate.of(2023, Month.SEPTEMBER, 4));
        service.addWorkDay(0, 0, "больничный", LocalDate.of(2023, Month.SEPTEMBER, 5));
        service.printWorkHistory(0);
        service.printWorkHistory(1);
        service.addEmploymentBook(1, "1234567", "Работал поваром");
        service.addPassport(1, "56 17 123456", "ул. Зелёная", "ОУМФЦ России...");
        service.printDocuments(1);
        service.printDocuments(0);

    }

}

