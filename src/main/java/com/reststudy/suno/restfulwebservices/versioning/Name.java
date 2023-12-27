package com.reststudy.suno.restfulwebservices.versioning;

public class Name {
    private String firstName;
    private String SecondName;


    public Name(String firstName, String secondName) {
        this.firstName = firstName;
        SecondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return SecondName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", SecondName='" + SecondName + '\'' +
                '}';
    }
}
