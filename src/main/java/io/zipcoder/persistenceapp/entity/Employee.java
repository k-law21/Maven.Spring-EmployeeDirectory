package io.zipcoder.persistenceapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;


    public Employee(){

    }
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }


    public Long getEmployeeId() {
        return id;
    }

    public void setEmployeeId(Long id) {
        this.id = id;
    }

    public String getEmployeeFirstName() {
        return firstName;
    }

    public void setEmployeeFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmployeeLastName() {
        return lastName;
    }

    public void setEmployeeLastName(String lastName) {
        this.lastName = lastName;
    }


}
