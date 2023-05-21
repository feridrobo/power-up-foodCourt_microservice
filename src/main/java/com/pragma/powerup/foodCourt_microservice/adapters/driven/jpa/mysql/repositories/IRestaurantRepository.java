package com.pragma.powerup.foodCourt_microservice.adapters.driven.jpa.mysql.repositories;
import com.pragma.powerup.foodCourt_microservice.adapters.driven.jpa.mysql.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRestaurantRepository extends JpaRepository<RestaurantEntity, Long> {
}
