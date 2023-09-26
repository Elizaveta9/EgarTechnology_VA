package org.homework1;

import java.time.LocalDate;

public class WorkDay {
    private int hoursWorked;
    private String absenceReason;
    private LocalDate date;

    public WorkDay(int hoursWorked, String absenceReason, LocalDate date) {
        this.hoursWorked = hoursWorked;
        this.absenceReason = absenceReason;
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getAbsenceReason() {
        return absenceReason;
    }

    public void setAbsenceReason(String absenceReason) {
        this.absenceReason = absenceReason;
    }

    @Override
    public String toString() {
        return date.toString() + " Часов отработано = " + hoursWorked + " (" + absenceReason + ")";
    }


}
