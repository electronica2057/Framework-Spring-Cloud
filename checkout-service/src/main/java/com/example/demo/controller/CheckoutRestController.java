package com.example.demo.controller;

import com.example.demo.model.Checkout;
import com.example.demo.service.ICheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/checkout")
public class CheckoutRestController {
    private ICheckoutService checkoutService;

    public CheckoutRestController(ICheckoutService iCheckoutService) {
        super();
        this.checkoutService = iCheckoutService;
    }


    @GetMapping()
    public Checkout getCheckout(@RequestParam List<String> productIds){
        return checkoutService.buildCheckout(productIds);
    }

}
