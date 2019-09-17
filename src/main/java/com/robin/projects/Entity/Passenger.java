package com.robin.projects.Entity;

import com.robin.projects.Model.PassengerModel;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Passenger implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "age")
    private int age;

    @Column(name = "email")
    private String email;


    public Passenger(){}

    public Passenger(PassengerModel passengerModel){
        this.id = passengerModel.getId();
        this.firstName = passengerModel.getFirstname();
        this.lastName = passengerModel.getLastname();
        this.age = passengerModel.getAge();
    }

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstName;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
