package com.usa.ciclo4.reto2ciclo4.repository;

import java.util.List;
import java.util.Optional;

import com.usa.ciclo4.reto2ciclo4.model.Order;
import com.usa.ciclo4.reto2ciclo4.repository.crud.OrderCrudRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {

    @Autowired
    private OrderCrudRepository orderCrudRepository;

    public List<Order> getAll() {
        return (List<Order>) orderCrudRepository.findAll();
    }

    
    public Optional<Order> getOrder(int id) {
        return orderCrudRepository.findById(id);
    }

    public Order create(Order order) {
        return orderCrudRepository.save(order);
    }

    public void update(Order order) {
        orderCrudRepository.save(order);
    }

    public void delete(Order order) {
        orderCrudRepository.delete(order);
    }


    public Optional<Order> lastUserId() {
        return null;
    }
    
    
}
