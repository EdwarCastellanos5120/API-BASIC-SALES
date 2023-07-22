package com.api.api_productos.Services;

import com.api.api_productos.Models.Product;
import com.api.api_productos.Models.Provider;
import com.api.api_productos.Repository.IProductRepository;
import com.api.api_productos.Repository.IProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements  IProductService{

    @Autowired
    private IProductRepository productRepository;

    @Autowired
    IProviderRepository providerRepository;


    @Override
    public List<Product> listProducts() {
       return productRepository.findAll();
    }

    @Override
    public Product createdProduct(Product product) {
        if (product.getProvider() != null && product.getProvider().getId() != null) {
            Provider existingProvider = providerRepository.findById(product.getProvider().getId()).orElse(null);
            if (existingProvider != null) {
                product.setProvider(existingProvider);
                return productRepository.save(product);
            }
        }
        product.setProvider(null);
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        Long productId = product.getId();
        Product existingProduct = productRepository.findById(productId).orElse(null);

        if (existingProduct != null) {
            existingProduct.setName(product.getName());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setQuantity(product.getQuantity());
            Provider updatedProvider = product.getProvider();
            if (updatedProvider != null) {
                Long providerId = updatedProvider.getId();
                Provider existingProvider = existingProduct.getProvider();
                if (providerId != null && existingProvider != null) {
                    existingProvider.setName(updatedProvider.getName());
                    existingProvider.setNit(updatedProvider.getNit());
                    existingProvider.setAddress(updatedProvider.getAddress());
                } else if (providerId != null && existingProvider == null) {
                    existingProduct.setProvider(updatedProvider);
                } else if (providerId == null && existingProvider != null) {
                    existingProduct.setProvider(null);
                }
            }
            return productRepository.save(existingProduct);
        } else {
            return null;
        }
    }
    @Override
    public void deleteProduct(Long id) {
         productRepository.deleteById(id);
    }
}
