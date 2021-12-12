package com.usa.ciclo4.reto2ciclo4.repository.crud;

import java.util.List;
import java.util.Optional;

import com.usa.ciclo4.reto2ciclo4.model.Order;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface OrderCrudRepository extends MongoRepository<Order, Integer> {
    
  
    @Query("{'salesMan.zone': ?0}")
    List<Order> findByZone(final String country);
    

    @Query("{status: ?0}")
    List<Order> findByStatus(final String status);
    

    Optional<Order> findTopByOrderByIdDesc();

}