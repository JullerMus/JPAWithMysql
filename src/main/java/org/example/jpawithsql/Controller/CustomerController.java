package org.example.jpawithsql.Controller;

import org.example.jpawithsql.Model.Customer;
import org.example.jpawithsql.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customerlist")
    public List<Customer> getAllCustomers() {
        return customerService.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/addcustomer")
    public Customer addCustomer(@RequestBody Customer customer) {
        //Customer customer = new Customer("Jules", "Lykkegaard", 0.0);
        return customerService.save(customer);
    }

}
