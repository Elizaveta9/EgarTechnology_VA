package org.homework1;

import java.util.Date;

public class WorkDay {
    private int hoursWorked;
    private String absenceReason;
    private Date date;

    public WorkDay(int hoursWorked, String absenceReason, Date date) {
        this.hoursWorked = hoursWorked;
        this.absenceReason = absenceReason;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "WorkDay{" +
                "hoursWorked=" + hoursWorked +
                ", absenceReason='" + absenceReason + '\'' +
                ", date=" + date +
                '}';
    }
}
