package com.pragma.powerup.foodCourt_microservice.domain.spi;

import com.pragma.powerup.foodCourt_microservice.domain.model.Restaurant;

public interface IRestaurantPersistencePort {
    void saveRestaurant(Restaurant restaurant);

}

