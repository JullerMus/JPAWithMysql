package org.example.jpawithsql.Repository;

import org.example.jpawithsql.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);


    Customer findByFirstName(String firstName);
}
