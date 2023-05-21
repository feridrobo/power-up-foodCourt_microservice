package com.pragma.powerup.foodCourt_microservice.adapters.driving.http.dto.request;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import static com.pragma.powerup.foodCourt_microservice.configuration.Constants.*;
import static com.pragma.powerup.foodCourt_microservice.configuration.Constants.EMPTY_URLLOGOTYPE_MESSAGE;

public class RestaurantRequestDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = EMPTY_NAME_MESSAGE)
    @Pattern(regexp = "^(?=.*[a-zA-Z])([a-zA-Z0-9 ]+)$", message = INVALID_FORMAT_NAME_MESSAGE)
    private String name;

    @NotBlank(message = EMPTY_NIT_MESSAGE)
    @Pattern(regexp = "^[0-9]+$", message = INVALID_FORMAT_NIT_MESSAGE)
    private String nit;

    @NotBlank(message = EMPTY_DIRECTION_MESSAGE)
    private String direction;

    @NotNull(message = EMPTY_IDOWNER_MESSAGE)
    private Long idOwner;

    @NotBlank(message = EMPTY_PHONE_MESSAGE)
    @Pattern(regexp = "^[0-9+]+$", message = INVALID_FORMAT_PHONE_MESSAGE)
    @Size(max = 13, message = INVALID_SIZE_PHONE_MESSAGE)
    private String phone;

    @NotBlank(message = EMPTY_URLLOGOTYPE_MESSAGE)
    private String urlLogotype;
}
