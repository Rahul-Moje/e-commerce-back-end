package com.myorganisation.mydepartment.ecommerce;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    @CrossOrigin("http://localhost:3000")
    public List<Product> getAllProducts() {
        List<Product> productList = new ArrayList<>();
        Product product = new Product();
        product.setProductId(1L);
        product.setProductName("Samsung Galaxy M10");
        product.setCategory(Category.ELECTRONICS);
        product.setSubCategory(SubCategory.MOBILE);
        product.setQuantity(100L);
        List<String> features = new ArrayList<>();
        features.add("4GB RAM");
        features.add("64GB Internal Storage");
        features.add("Snapdragon 710 Processor");
        product.setFeatures(features);
        productList.add(product);
        return productList;
    }
}
