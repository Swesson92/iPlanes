package com.robin.projects.Model;

import com.robin.projects.Entity.Passenger;

import java.io.Serializable;

public class PassengerModel implements Serializable {

    private Long id;
    private String firstname;
    private String lastname;
    private int age;


    public PassengerModel(Passenger passenger){
        this.id = passenger.getId();
        this.firstname = passenger.getFirstname();
        this.lastname = passenger.getLastname();
        this.age = passenger.getAge();
    }

    public PassengerModel(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
