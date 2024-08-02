package com.example.ECommerceWebsite.controller;

import com.example.ECommerceWebsite.model.Product;
import com.example.ECommerceWebsite.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getProduct(){
        //System.out.println(productService.getProduct().get(1));
        return productService.getProduct();
    }
    @GetMapping("/products/{prodId}")
    public Optional<Product> getProductById(@PathVariable int prodId){
        //System.out.println(productService.getProduct().get(1));
        return productService.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){
        productService.addProduct(prod);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
    }
    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        productService.deleteProduct(prodId);
    }
}
