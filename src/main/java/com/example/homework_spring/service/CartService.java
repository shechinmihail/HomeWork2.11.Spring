package com.example.homework_spring.service;


import com.example.homework_spring.repository.CartRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CartService {
    public final CartRepository cartRepository;

    public CartService(CartRepository cartRepository){
        this.cartRepository = cartRepository;
    }
    public void addToCart(List<Integer> ids){
        this.cartRepository.addToCart(ids);
    }

    public List<Integer> getCart(){
        return this.cartRepository.getCart();
    }
}
