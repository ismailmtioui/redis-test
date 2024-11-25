package com.example.redis_service.service;


import com.example.redis_service.entity.Product;
import com.example.redis_service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Create or update a product
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // Get product by id
    public Product getProductById(String id) {
        return productRepository.findById(id).orElse(null);
    }

    // Delete product by id
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }

    // Get all products
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
