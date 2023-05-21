package com.pragma.powerup.foodCourt_microservice.adapters.driven.jpa.mysql.mappers;

import com.pragma.powerup.foodCourt_microservice.adapters.driven.jpa.mysql.entity.RestaurantEntity;
import com.pragma.powerup.foodCourt_microservice.domain.model.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IRestaurantEntityMapper {
    RestaurantEntity toEntity(Restaurant restaurant);

}
