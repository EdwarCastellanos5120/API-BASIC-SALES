package com.api.api_productos.Services;

import com.api.api_productos.Models.Product;

import java.util.List;

public interface IProductService {

    List<Product> listProducts();

    Product createdProduct(Product product);

    Product updateProduct(Product product);

    void deleteProduct(Long id);

    Product searchProductById(Long id);

    Product searchProductByName(String name);

    List<Product> searchProductByPrice(float price);

    List<Product> searchProductByQuantityGreaterThan(int quantity);

    List<Product> searchProductByProviderId(Long id);
    List<Product> searchProductByNameAndPrice(String name, float price);

    List<Product> searchProductByProviderName(String name);

    Product searchProductByProviderNit(String nit);

}
