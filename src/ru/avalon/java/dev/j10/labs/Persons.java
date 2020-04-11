package ru.avalon.java.dev.j10.labs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Persons implements Person{
    private String name;
    private Date birthDate;



    @Override
    public String toString() {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd MM yyyy");
        Date birthd = birthDate;
        birthd.setYear(birthDate.getYear()-1900);
        birthd.setMonth(birthDate.getMonth()-1);

        return "Persons{" +
                "name='" + name + '\'' +
                ", birthDate: " + formatDate.format(birthd) +
                '}';
    }


    public Persons(String name, int year, int mouth, int day) {
        this.name = name;
        this.birthDate = new Date(year,mouth,day);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public int compareTo(Object o) {
        Persons persons = (Persons) o;
        if (name.compareTo(persons.name) == 0) {
            return birthDate.compareTo(persons.birthDate);
        }
        return name.compareTo(persons.name);
    }
}
