package com.api.api_productos.Controller;

import com.api.api_productos.Models.Customer;
import com.api.api_productos.Models.Product;
import com.api.api_productos.Services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/list")
    public List<Product> list() {
        return productService.listProducts();
    }

    @PostMapping("/create")
    public Product create(@RequestBody Product product) {
        return productService.createdProduct(product);
    }

    @PutMapping("/update/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product product) {
        product.setId(id);
        return productService.updateProduct(product);
    }


    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        productService.deleteProduct(id);
    }
}
