package com.pragma.powerup.foodCourt_microservice.domain.services;

import com.fasterxml.jackson.databind.JsonNode;
import com.pragma.powerup.foodCourt_microservice.adapters.driven.client.adapter.IRoleServiceClient;
import com.pragma.powerup.foodCourt_microservice.adapters.driven.jpa.mysql.exceptions.InvalidRoleNameException;
import org.springframework.http.ResponseEntity;

import static com.pragma.powerup.foodCourt_microservice.configuration.Constants.NAME_ROLE_OWNER;


public class RestaurantServices {

    private final IRoleServiceClient roleServiceClient;

    public RestaurantServices(IRoleServiceClient roleServiceClient) {
        this.roleServiceClient = roleServiceClient;
    }

    public String getNameFromRoleService(Long userId) {
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
}
