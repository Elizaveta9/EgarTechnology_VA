package org.homework1;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class WorkDay {
    private int hoursWorked;
    private String absenceReason;
    private Calendar date;

    public WorkDay(int hoursWorked, String absenceReason, Calendar date) {
        this.hoursWorked = hoursWorked;
        this.absenceReason = absenceReason;
        this.date = date;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
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
        SimpleDateFormat formater = new SimpleDateFormat("dd.MM.yyyy (E)");
        return formater.format(date.getTime()) + " Часов отработано = " + hoursWorked + " (" + absenceReason + ")";
    }
}
