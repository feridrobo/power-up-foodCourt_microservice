package com.pragma.powerup.foodCourt_microservice.adapters.driving.http.handlers.impl;

import com.pragma.powerup.foodCourt_microservice.adapters.driving.http.dto.request.RestaurantRequestDto;
import com.pragma.powerup.foodCourt_microservice.adapters.driving.http.handlers.IRestaurantHandler;
import com.pragma.powerup.foodCourt_microservice.domain.api.IRestaurantServicePort;
import com.pragma.powerup.foodCourt_microservice.adapters.driving.http.mapper.IRestaurantRequestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestaurantHandlerImpl implements IRestaurantHandler {
    private final IRestaurantServicePort restaurantServicePort;
    private final IRestaurantRequestMapper restaurantRequestMapper;

    @Override
    public void saveRestaurant(RestaurantRequestDto restaurantRequestDto) {
        restaurantServicePort.saveRestaurant(restaurantRequestMapper.toRestaurant(restaurantRequestDto));
    }


}
