package com.example.demo.service.implementation;

import com.example.demo.model.Checkout;
import com.example.demo.model.Product;
import com.example.demo.service.ICheckoutService;
import com.example.demo.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CheckoutService implements ICheckoutService {


    private IProductService productService;

    public CheckoutService(IProductService productService) {
        this.productService = productService;
    }

    @Override
    public Checkout buildCheckout(List<String> productIds) {

        Double total = 0.0;
        for (String id:productIds
             ) {
            Product product = productService.getProducts(id);
            total += product.getPrice();
            System.out.println(product.getInstancia());


        }
        Checkout checkout = new Checkout("123","",total.toString(),List.of("sadfasd"));

        return checkout;
    }
}
