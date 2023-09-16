package org.homework1;

import java.util.List;

public class Employee {
    private static int idCount = 0;

    private int id;
    private String firstName;
    private String surname;
    private String role;
    private List<WorkDay> workHistory;

    public Employee(String firstName, String surname, String role) {
        this.firstName = firstName;
        this.surname = surname;
        this.role = role;
        id = idCount++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<WorkDay> getWorkHistory() {
        return workHistory;
    }

    public void setWorkHistory(List<WorkDay> workHistory) {
        this.workHistory = workHistory;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + ". " + firstName + " " + surname + ": " + role;
    }
}
