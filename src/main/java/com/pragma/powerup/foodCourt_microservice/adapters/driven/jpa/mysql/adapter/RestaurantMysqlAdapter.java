package com.pragma.powerup.foodCourt_microservice.adapters.driven.jpa.mysql.adapter;

import com.pragma.powerup.foodCourt_microservice.adapters.driven.jpa.mysql.entity.RestaurantEntity;
import com.pragma.powerup.foodCourt_microservice.adapters.driven.jpa.mysql.mappers.IRestaurantEntityMapper;
import com.pragma.powerup.foodCourt_microservice.domain.model.Restaurant;
import com.pragma.powerup.foodCourt_microservice.domain.spi.IRestaurantPersistencePort;
import com.pragma.powerup.foodCourt_microservice.adapters.driven.jpa.mysql.repositories.IRestaurantRepository;


public class RestaurantMysqlAdapter implements IRestaurantPersistencePort {
    private final IRestaurantEntityMapper restaurantEntityMapper;
    private final IRestaurantRepository restaurantRepository;

    public RestaurantMysqlAdapter(IRestaurantEntityMapper restaurantEntityMapper, IRestaurantRepository restaurantRepository) {
        this.restaurantEntityMapper = restaurantEntityMapper;
        this.restaurantRepository = restaurantRepository;
    }


    @Override
    public void saveRestaurant(Restaurant restaurant) {
        RestaurantEntity restaurantEntity = restaurantEntityMapper.toEntity(restaurant);
        restaurantRepository.save(restaurantEntity);
    }
}
