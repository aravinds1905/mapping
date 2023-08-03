package com.example.random.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")
public class Address_model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "addID")
    private Long addID;

    @Column(name = "addCity")
    private String addCity;

    @Column(name = "addType")
    private String addType;

    

    public Address_model() {
    }

    public Address_model(Long addID, String addCity, String addType) {
        this.addID = addID;
        this.addCity = addCity;
        this.addType = addType;
    }

    public Long getAddID() {
        return addID;
    }

    public void setAddID(Long addID) {
        this.addID = addID;
    }

    public String getAddCity() {
        return addCity;
    }

    public void setAddCity(String addCity) {
        this.addCity = addCity;
    }

    public String getAddType() {
        return addType;
    }

    public void setAddType(String addType) {
        this.addType = addType;
    }

    @Override
    public String toString() {
        return "first [id=" + addID + ", city=" + addCity + ", type=" + addType + "]";
    }
}