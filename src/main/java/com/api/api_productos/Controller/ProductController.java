package com.api.api_productos.Controller;

import com.api.api_productos.Models.Customer;
import com.api.api_productos.Models.Product;
import com.api.api_productos.Services.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
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

    @GetMapping("/search/byId/{id}")
    public Product searchById(@PathVariable("id") Long id) {
        return productService.searchProductById(id);
    }

    @GetMapping("/search/byName/{name}")
    public Product searchByName(@PathVariable("name") String name) {
        return productService.searchProductByName(name);
    }

    @GetMapping("/search/byPrice/{price}")
    public List<Product> searchByPrice(@PathVariable("price") float price) {
        return productService.searchProductByPrice(price);
    }

    @GetMapping("/search/byQuantityGreaterThan/{quantity}")
    public List<Product> searchByQuantityGreaterThan(@PathVariable("quantity") int quantity) {
        return productService.searchProductByQuantityGreaterThan(quantity);
    }

    @GetMapping("/search/byProviderId/{id}")
    public List<Product> searchByProviderId(@PathVariable("id") Long id) {
        return productService.searchProductByProviderId(id);
    }

    @GetMapping("/search/byNameAndPrice/{name}/{price}")
    public List<Product> searchByNameAndPrice(@PathVariable("name") String name, @PathVariable("price") float price) {
        return productService.searchProductByNameAndPrice(name, price);
    }

    @GetMapping("/search/byProviderName/{name}")
    public List<Product> searchByProviderName(@PathVariable("name") String name) {
        return productService.searchProductByProviderName(name);
    }

    @GetMapping("/search/byProviderNit/{nit}")
    public Product searchByProviderNit(@PathVariable("nit") String nit) {
        return productService.searchProductByProviderNit(nit);
    }
}
