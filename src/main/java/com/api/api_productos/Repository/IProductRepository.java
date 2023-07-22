package com.api.api_productos.Repository;

import com.api.api_productos.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {

    Product findByName(@Param("name") String name);
    List<Product> findByPrice(@Param("price") float price);
    List<Product> findByQuantityGreaterThan(@Param("quantity") int quantity);
    List<Product> findByProviderId(@Param("id") Long id);
    List<Product> findByNameAndPrice(@Param("name") String name, @Param("price") float price);
    List<Product> findByProviderName(@Param("name") String name);
    Product findByProviderNit(@Param("nit") String nit);
}
