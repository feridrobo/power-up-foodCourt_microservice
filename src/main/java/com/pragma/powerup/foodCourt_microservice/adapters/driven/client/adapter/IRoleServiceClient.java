package com.pragma.powerup.foodCourt_microservice.adapters.driven.client.adapter;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.pragma.powerup.foodCourt_microservice.configuration.Constants.USER_SERVICE_NAME;
import static com.pragma.powerup.foodCourt_microservice.configuration.Constants.USER_SERVICE_URL;

@FeignClient(name = USER_SERVICE_NAME, url = USER_SERVICE_URL)
public interface IRoleServiceClient {

    @GetMapping("user/{userId}/role")
    @ResponseBody
    ResponseEntity<JsonNode> getRoleForUserById(@PathVariable Long userId);
}