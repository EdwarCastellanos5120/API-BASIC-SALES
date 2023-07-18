package com.api.api_productos.Controller;

import com.api.api_productos.Models.Customer;
import com.api.api_productos.Services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;


    @GetMapping("/list")
    public List<Customer> list(){
        return customerService.listcustomer();

    }
}
