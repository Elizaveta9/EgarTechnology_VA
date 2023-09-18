package org.homework1;

public class EmploymentBook extends Document {
    private String employmentHistory;

    public EmploymentBook(String id, String firstName, String surname, String employmentHistory) {
        super(id, firstName, surname);
        this.employmentHistory = employmentHistory;
    }

    public String getEmploymentHistory() {
        return employmentHistory;
    }

    public void setEmploymentHistory(String employmentHistory) {
        this.employmentHistory = employmentHistory;
    }

    @Override
    public String toString() {
        return "Данные трудовой книжки: \n№ " + super.getId() +
                "\nСведения о работе: " + employmentHistory + "\n";
    }
}
