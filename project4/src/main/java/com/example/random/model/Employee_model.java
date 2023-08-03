package com.example.random.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee_model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "empID")
    private Long empID;

    @Column(name = "empName")
    private String empName;

    @Column(name = "empAge")
    private Long empAge;

    public Employee_model() {
    }

    public Employee_model(long empID, String empName, Long empAge, List<Address_model> address) {
        this.empID = empID;
        this.empName = empName;
        this.empAge = empAge;
        this.address = address;
    }

    public Long getEmpID() {
        return empID;
    }

    public void setEmpID(Long empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Long getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Long empAge) {
        this.empAge = empAge;
    }

    public List<Address_model> getAddress() {
        return address;
    }

    public void setAddress(List<Address_model> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "first [id=" + empID + ", name=" + empName + ", age=" + empAge + ", address=" + address + "]";
    }

    // @OneToOne(cascade = CascadeType.ALL)
    // @JoinColumn(name = "addID")
    // private Address__model address;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "empId", referencedColumnName = "empId")
    private List<Address_model> address;

}