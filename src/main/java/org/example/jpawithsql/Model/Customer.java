package org.example.jpawithsql.Model;

import jakarta.persistence.*;

@Entity
//@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private double totalSpend;

    protected Customer() {}

    public Customer(String firstName, String lastName, double totalSpend) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSpend = totalSpend;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getId() {
        return id;
    }

    public double getTotalSpend() {
        return totalSpend;
    }
}
