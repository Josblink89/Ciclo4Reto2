package com.usa.ciclo4.reto2ciclo4.repository.crud;

import java.util.List;

import com.usa.ciclo4.reto2ciclo4.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ProductCrudRepository extends MongoRepository<Product,String> {

    public List<Product> findByPriceLessThanEqual(double precio);

    @Query("{'description':{'$regex':'?0','$options':'i'}}")
public List<Product> findByDescriptionLike(String description);

}
