package com.pragma.powerup.foodCourt_microservice.adapters.driving.http.handlers;

import com.pragma.powerup.foodCourt_microservice.adapters.driving.http.dto.request.RestaurantRequestDto;

public interface IRestaurantHandler {
    void saveRestaurant(RestaurantRequestDto restaurantRequestDto);

}
