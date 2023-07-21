package com.api.api_productos.Services;

import com.api.api_productos.Models.Customer;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ICustomerService {

    List<Customer> listcustomer();

    Customer createdCustomer(Customer customer);

    Customer updateCustomer(Customer customer);

    void deleteCustomer(Long id);

    Optional<Customer> searchCustomerById(Long id);

    Customer searchCustomerfindByDPI(String dpi);

    List<Customer> searchCustomerKeyword(String keyword);

    List<Customer> searchCustomerBirthDate(Date birthDate);
}
