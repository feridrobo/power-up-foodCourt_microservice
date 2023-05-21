package com.pragma.powerup.foodCourt_microservice.domain.api;

import com.pragma.powerup.foodCourt_microservice.domain.model.Restaurant;

public interface IRestaurantServicePort {
    void saveRestaurant(Restaurant restaurant);

}
