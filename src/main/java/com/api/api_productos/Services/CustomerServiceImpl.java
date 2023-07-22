package com.api.api_productos.Services;

import com.api.api_productos.Models.Customer;
import com.api.api_productos.Repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
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

    @Override
    public List<Customer> searchCustomerKeyword(String keyword) {
        List<Customer> allResults = new ArrayList<>();
        allResults.addAll(customerRepository.findByName1(keyword));
        allResults.addAll(customerRepository.findByName2(keyword));
        allResults.addAll(customerRepository.findByLastName1(keyword));
        allResults.addAll(customerRepository.findByLastName2(keyword));
        allResults.addAll(customerRepository.findByLastName3(keyword));
        return allResults;
    }

    //Metodo para buscar a los clientes por fecha de nacimiento
    @Override
    public List<Customer> findByBirthDate(@DateTimeFormat(pattern = "yyyy-MM-dd") Date birthDate) {
        return customerRepository.findByBirthDate(birthDate);
    }
}
