package ru.avalon.java.dev.j10.labs;


import java.time.LocalDate;


public class Persons implements Person{
    private String name;
    private LocalDate birthDate;



    @Override
    public String toString() {

        return "Persons{" +
                "name='" + name + '\'' +
                ", birthDate: " + birthDate +
                '}';
    }

    public Persons(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }


    @Override
    public String getName() {
        return name;
    }


    @Override
    public int compareTo(Object o) {
        Persons persons = (Persons) o;
        if (name.compareTo(persons.name) == 0) {
            return birthDate.compareTo(persons.birthDate);
        }
        return name.compareTo(persons.name);
    }

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }
}
