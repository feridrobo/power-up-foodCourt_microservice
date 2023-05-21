package com.pragma.powerup.foodCourt_microservice.adapters.driving.http.mapper;
import com.pragma.powerup.foodCourt_microservice.adapters.driving.http.dto.request.RestaurantRequestDto;
import com.pragma.powerup.foodCourt_microservice.domain.model.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IRestaurantRequestMapper {
    Restaurant toRestaurant(RestaurantRequestDto restaurantRequestDto);
}
