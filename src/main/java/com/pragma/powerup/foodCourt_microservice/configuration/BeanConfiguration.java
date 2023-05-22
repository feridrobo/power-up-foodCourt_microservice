package com.pragma.powerup.foodCourt_microservice.configuration;

import com.pragma.powerup.foodCourt_microservice.adapters.driven.jpa.mysql.adapter.RestaurantMysqlAdapter;
import com.pragma.powerup.foodCourt_microservice.domain.api.IRestaurantServicePort;
import com.pragma.powerup.foodCourt_microservice.domain.spi.IRestaurantPersistencePort;
import com.pragma.powerup.foodCourt_microservice.domain.usecase.RestaurantUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.pragma.powerup.foodCourt_microservice.adapters.driven.jpa.mysql.repositories.IRestaurantRepository;
import com.pragma.powerup.foodCourt_microservice.adapters.driven.jpa.mysql.mappers.IRestaurantEntityMapper;


@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final IRestaurantRepository restaurantRepository;
    private final IRestaurantEntityMapper restaurantEntityMapper;
    @Bean
    public IRestaurantPersistencePort restaurantPersistencePort() {
        return new RestaurantMysqlAdapter(restaurantEntityMapper,restaurantRepository);
    }

    @Bean
    public IRestaurantServicePort restaurantServicePort() {
        return new RestaurantUseCase(restaurantPersistencePort());
    }
}
