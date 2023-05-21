package com.pragma.powerup.foodCourt_microservice.domain.usecase;

import com.pragma.powerup.foodCourt_microservice.domain.api.IRestaurantServicePort;
import com.pragma.powerup.foodCourt_microservice.domain.model.Restaurant;
import com.pragma.powerup.foodCourt_microservice.domain.services.RestaurantServices;


public class RestaurantUseCase implements IRestaurantServicePort {

    private final RestaurantServices restaurantServices;

    public RestaurantUseCase( RestaurantServices restaurantServices) {
        this.restaurantServices = restaurantServices;
    }

    @Override
    public void saveRestaurant(Restaurant restaurant) {
        restaurantServices.validateIdOwner(restaurant.getIdOwner());
    }
}

