package com.example.makesoft.api;

import com.example.makesoft.model.Product;
import com.example.makesoft.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductApi {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> getAll() {
        return ResponseEntity.ok(productService.getAll());
    }

    @PostMapping
    public ResponseEntity<Product> save(@RequestBody Product product) {
        productService.save(product);
        return ResponseEntity.ok(product);
    }
}
