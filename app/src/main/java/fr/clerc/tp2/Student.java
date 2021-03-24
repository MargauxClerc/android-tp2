package fr.clerc.tp2;

public class Student {
    int id;
    String firstName;
    String lastName;
    String gender;
    int age;

    Student(int id, String firstName, String lastName, String gender, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName.toUpperCase();
    }
}