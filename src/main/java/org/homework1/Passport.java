package org.homework1;

public class Passport extends Document {
    private String address;
    private String whoGave;

    public Passport(String id, String firstName, String surname, String address, String whoGave) {
        super(id, firstName, surname);
        this.address = address;
        this.whoGave = whoGave;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWhoGave() {
        return whoGave;
    }

    public void setWhoGave(String whoGave) {
        this.whoGave = whoGave;
    }

    @Override
    public String toString() {
        return "Данные паспорта:\n№ " + super.getId() +
                "\nАдрес проживания: " + address + "\n" +
                "Кем выдан: " + whoGave + "\n" ;
    }

}
