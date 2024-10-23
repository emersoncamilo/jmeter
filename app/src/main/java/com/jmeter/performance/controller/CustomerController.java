package com.jmeter.performance.controller;

import com.jmeter.performance.model.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private List<Customer> customerList = new ArrayList<>();
    private long idCounter = 1;


    @GetMapping
    public ResponseEntity<List<Customer>> list() {
        return ResponseEntity.ok(generateList());
    }






    private List<Customer> generateList() {
        // Populate the list with sample customers
        if (customerList.isEmpty()) {
            customerList.add(new Customer(idCounter++, "John Doe"));
            customerList.add(new Customer(idCounter++, "Jane Smith"));
            customerList.add(new Customer(idCounter++, "Alice Johnson"));
        }
        return customerList;
    }

}
