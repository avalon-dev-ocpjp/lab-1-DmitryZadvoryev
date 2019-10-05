package ru.avalon.java.ocpjp.labs.tasks.objects;

public class RealCitizen implements Citizen {

    private Country country;
    private String name;
    private String lastName;

    public RealCitizen(Country country, String name, String lastName) {
        this.country = country;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public Country getCountry() {
        return country;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Lastname: " + lastName + ", Country: " + country.toString();
    }

}
