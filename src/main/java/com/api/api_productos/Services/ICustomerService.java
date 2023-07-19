package com.api.api_productos.Services;

import com.api.api_productos.Models.Customer;

import java.util.List;

public interface ICustomerService {

    List<Customer> listcustomer();

    Customer createdCustomer(Customer customer);

    Customer updateCustomer(Customer customer);

    void deleteCustomer(Long id);
}
