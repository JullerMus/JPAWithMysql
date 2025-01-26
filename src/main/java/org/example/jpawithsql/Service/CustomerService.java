package org.example.jpawithsql.Service;

import org.example.jpawithsql.Model.Customer;
import org.example.jpawithsql.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.jpawithsql.Model.Customer;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> findAll() {
        for(Customer customer : customerRepository.findAll()) {
            customer.getFirstName();
        }
        return customerRepository.findAll();
    }

    // Optional - A container object which may or may not contain a non-null value.
    // If a value is present, isPresent() will return true and get() will return the value.
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    public void deleteById(Long id) {
        customerRepository.deleteById(id);
    }

    public Customer update(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer findByFirstName(String firstName) {
        System.out.println(customerRepository.findByFirstName(firstName));
        return customerRepository.findByFirstName(firstName);
    }
}
