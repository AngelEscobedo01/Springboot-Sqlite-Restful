package com.example.restfulapp.customer;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "customers")
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue
    @Setter
    private Long id; // @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Getter @Setter
    public String firstName;

    @Getter @Setter
    public String lastName;

    @Getter @Setter
    public String emailAddress;

    @Getter @Setter
    public String address;

    @Getter @Setter
    public String city;

    @Getter @Setter
    public String state;

    @Getter @Setter
    public String zip;


    public Customer(String firstName, String lastName, String emailAddress, String address, String city, String state, String zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Customer() {

    }

    public Long getId() {
        return id;
    }

}

