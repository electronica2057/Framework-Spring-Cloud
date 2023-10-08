package com.example.demo.service.implementation;

import com.example.demo.model.Product;
import com.example.demo.repository.FeignProductRepository;
import com.example.demo.service.IProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {

    private FeignProductRepository feignProductRepository;
    @Override
    public Product getProducts(String id) {
        return feignProductRepository.getProductById(id);
    }

    public ProductService(FeignProductRepository feignProductRepository) {
        super();
        this.feignProductRepository = feignProductRepository;
    }
}
