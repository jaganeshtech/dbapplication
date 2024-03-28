package com.bootexample;

import com.bootexample.jpa.dto.Product;
import com.bootexample.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UserController {
@Autowired
RestTemplate restTemplate;

@Autowired ProductService productService;
    @GetMapping("/status")
    public String status() {
        return "api service up";
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<String> getid(@PathVariable("id") int id) {

        return ResponseEntity.ok("Requested User:" + id);
    }

    @GetMapping("/getUser")
    public ResponseEntity<String> getUsers(@RequestParam(value = "id",required = false) Integer id) {
       var response= restTemplate.getForObject("http://localhost:8080/user/100",String.class);
        return ResponseEntity.ok("dfd"+response);

    }
    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts() {
      List<Product> ps=productService.getAllProduct();
        return ResponseEntity.ok(ps);

    }
}
