package com.seshu.ecommerce.service;

import com.seshu.ecommerce.dto.Purchase;
import com.seshu.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}