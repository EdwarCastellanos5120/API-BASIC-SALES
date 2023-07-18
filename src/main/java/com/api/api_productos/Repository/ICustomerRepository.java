package com.api.api_productos.Repository;

import com.api.api_productos.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository  extends JpaRepository<Customer,Long> {
}
