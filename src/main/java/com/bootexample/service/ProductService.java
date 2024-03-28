package com.bootexample.service;

import com.bootexample.jpa.dto.Product;
import com.bootexample.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {


    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProduct(){
        List<Product> ps=new ArrayList<>();
         productRepository.findAll().forEach(p->ps.add(p));
         return ps;
    }
}
