package com.abhishek.hulage.nimap.nimapinfotechtest.controller;

import com.abhishek.hulage.nimap.nimapinfotechtest.entity.Product;
import com.abhishek.hulage.nimap.nimapinfotechtest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts(@RequestParam(defaultValue = "0") Integer pageNumber,
                                        @RequestParam(defaultValue = "5") Integer pageSize) {
        return productService.getAllProductsByPageNumber(pageNumber, pageSize);
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable Integer id) {
        return productService.getProductById(id);
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @PutMapping("/products/{id}")
    public Product updateProduct(@PathVariable Integer id, @RequestBody Product updatedProduct) {
        return productService.updateProduct(id, updatedProduct);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Integer id) {
        productService.deleteProduct(id);
    }
}
