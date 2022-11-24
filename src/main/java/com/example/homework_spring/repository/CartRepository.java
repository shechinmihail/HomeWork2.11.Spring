package com.example.homework_spring.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Repository
@SessionScope
public class CartRepository {

    private final List<Integer> listId = new ArrayList<>();

    public void addToCart(List<Integer> ids){
        listId.addAll(ids);
    }

    public List<Integer> getCart(){
        return this.listId;
    }
}
