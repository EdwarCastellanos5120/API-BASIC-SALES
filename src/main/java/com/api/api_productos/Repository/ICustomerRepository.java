package com.api.api_productos.Repository;

import com.api.api_productos.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByDpi(@Param("dpi") String dpi);

    List<Customer> findByName1(@Param("name1") String name1);

    List<Customer> findByName2(@Param("name2") String name2);

    List<Customer> findByLastName1(@Param("LastName1") String LastName1);

    List<Customer> findByLastName2(@Param("LastName2") String LastName2);

    List<Customer> findByLastName3(@Param("LastName3") String LastName3);

    //@Query(value = "SELECT * FROM tb_clientes WHERE Cliente_Fecha = :birthDate", nativeQuery = true)
    List<Customer> findByBirthDate(@Param("birthDate") Date birthDate);
}

