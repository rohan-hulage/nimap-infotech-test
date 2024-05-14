package com.abhishek.hulage.nimap.nimapinfotechtest.service;

import com.abhishek.hulage.nimap.nimapinfotechtest.entity.Product;
import com.abhishek.hulage.nimap.nimapinfotechtest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProductsByPageNumber(int pageNumber, int pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize);
        Page<Product> paginatedProducts = productRepository.findAll(pageRequest);
        return paginatedProducts.getContent();
    }

    public Product getProductById(int id) {
        Optional<Product> product = productRepository.findById(id);
        return product.orElseThrow();
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(int id, Product updatedProduct) {
        return productRepository.findById(id).map(product -> {
            product.setProductName(updatedProduct.getProductName());
            product.setProductPrice(updatedProduct.getProductPrice());
            product.setProductCategory(updatedProduct.getProductCategory());
            return productRepository.save(product);
        }).orElseThrow();
    }

    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
}
