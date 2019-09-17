package com.robin.projects.Entity;


import com.robin.projects.Model.PlanesModel;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Planes implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "description")
    private String description;

    @Column(name = "state")
    private String state;

    @Column(name = "passenger_capacity")
    private int passengerCapacity;

    public Planes(){}

    public Planes(PlanesModel planesModel){
        this.id = planesModel.getId();
        this.manufacturer = planesModel.getManufacturer();
        this.description = planesModel.getDescription();
        this.state = planesModel.getState();
        this.passengerCapacity = planesModel.getPassengerCapacity();
    }

    public Long getId() {
        return id;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
}
