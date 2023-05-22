package com.pragma.powerup.foodCourt_microservice.domain.usecase;

import com.pragma.powerup.foodCourt_microservice.domain.api.IRestaurantServicePort;
import com.pragma.powerup.foodCourt_microservice.domain.model.Restaurant;
import com.pragma.powerup.foodCourt_microservice.domain.services.RestaurantServices;
import com.pragma.powerup.foodCourt_microservice.domain.spi.IRestaurantPersistencePort;


public class RestaurantUseCase implements IRestaurantServicePort {

    private final IRestaurantPersistencePort restaurantPersistencePort;


    public RestaurantUseCase( IRestaurantPersistencePort restaurantPersistencePort) {
        this.restaurantPersistencePort = restaurantPersistencePort;
    }

    @Override
    public void saveRestaurant(Restaurant restaurant) {
        RestaurantServices.validateIdOwner(restaurant.getIdOwner());
        restaurantPersistencePort.saveRestaurant(restaurant);
    }
}

