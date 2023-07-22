package com.api.api_productos.Services;

import com.api.api_productos.Models.Product;

import java.util.List;

public interface IProductService {

    List<Product> listProducts();

    Product createdProduct(Product product);

    Product updateProduct(Product product);

    void deleteProduct(Long id);
}
