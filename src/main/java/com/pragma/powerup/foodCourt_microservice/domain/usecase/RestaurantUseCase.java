package com.pragma.powerup.foodCourt_microservice.domain.usecase;

import com.fasterxml.jackson.databind.JsonNode;
import com.pragma.powerup.foodCourt_microservice.adapters.driven.client.adapter.IRoleServiceClient;
import com.pragma.powerup.foodCourt_microservice.adapters.driven.jpa.mysql.exceptions.InvalidRoleNameException;
import com.pragma.powerup.foodCourt_microservice.domain.api.IRestaurantServicePort;
import com.pragma.powerup.foodCourt_microservice.domain.model.Restaurant;
import com.pragma.powerup.foodCourt_microservice.domain.spi.IRestaurantPersistencePort;
import org.springframework.http.ResponseEntity;

import static com.pragma.powerup.foodCourt_microservice.configuration.Constants.NAME_ROLE_OWNER;


public class RestaurantUseCase implements IRestaurantServicePort {

    private final IRestaurantPersistencePort restaurantPersistencePort;
    private IRoleServiceClient roleServiceClient;


    public RestaurantUseCase(IRestaurantPersistencePort restaurantPersistencePort,
                             IRoleServiceClient roleServiceClient) {
        this.restaurantPersistencePort = restaurantPersistencePort;
        this.roleServiceClient = roleServiceClient;

    }


    public String getNameFromRoleService(Long userId) {
        if (roleServiceClient == null) {
            throw new IllegalStateException("roleServiceClient is not initialized");
        }
        ResponseEntity<JsonNode> response = roleServiceClient.getRoleForUserById(userId);
        if (response.getStatusCode().is2xxSuccessful()) {
            JsonNode jsonNode = response.getBody();
            if (jsonNode != null && jsonNode.has("name")) {
                return jsonNode.get("name").asText();
            }
        }
        throw new InvalidRoleNameException();
    }

    public void validateIdOwner(Long userId) {
        String roleName = getNameFromRoleService(userId);
        if (!roleName.equals(NAME_ROLE_OWNER)) {
            throw new InvalidRoleNameException();
        }
    }

    @Override
    public void saveRestaurant(Restaurant restaurant) {
        validateIdOwner(restaurant.getIdOwner());
        restaurantPersistencePort.saveRestaurant(restaurant);
    }

}
