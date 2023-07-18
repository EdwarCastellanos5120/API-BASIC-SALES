package com.api.api_productos.Services;

import com.api.api_productos.Models.Customer;
import com.api.api_productos.Repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
   private ICustomerRepository customerRepository;
    @Override
    public List<Customer> listcustomer() {
        return customerRepository.findAll();
    }
}
