package com.api.api_productos.Services;

import com.api.api_productos.Models.Customer;
import com.api.api_productos.Repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public List<Customer> listcustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Customer createdCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Optional<Customer> searchCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer searchCustomerfindByDPI(String dpi) {
        return customerRepository.findByDpi(dpi);
    }
}
