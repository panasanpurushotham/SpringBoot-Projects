package com.seshu.ecommerce.dto;

import com.seshu.ecommerce.entity.Address;
import com.seshu.ecommerce.entity.Customer;
import com.seshu.ecommerce.entity.Order;
import com.seshu.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}