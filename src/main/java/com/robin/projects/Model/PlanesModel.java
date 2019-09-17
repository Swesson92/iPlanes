package com.robin.projects.Model;

import com.robin.projects.Entity.Planes;

import java.io.Serializable;

public class PlanesModel implements Serializable {

    private Long id;
    private String manufacturer;
    private String description;
    private String state;
    private int passengerCapacity;



    public PlanesModel(Planes planes){
        this.id = planes.getId();
        this.manufacturer = planes.getManufacturer();
        this.description = planes.getDescription();
        this.state = planes.getState();
        this.passengerCapacity = planes.getPassengerCapacity();
    }

    public PlanesModel(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
