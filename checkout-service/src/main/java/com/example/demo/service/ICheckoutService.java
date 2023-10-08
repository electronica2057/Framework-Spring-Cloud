package com.example.demo.service;

import com.example.demo.model.Checkout;

import java.util.List;

public interface ICheckoutService {

    public Checkout buildCheckout(List<String> productIds);

}
