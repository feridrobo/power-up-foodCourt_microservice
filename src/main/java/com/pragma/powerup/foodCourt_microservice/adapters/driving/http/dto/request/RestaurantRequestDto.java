package com.pragma.powerup.foodCourt_microservice.adapters.driving.http.dto.request;

import com.pragma.powerup.foodCourt_microservice.configuration.Constants;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class RestaurantRequestDto {
    @NotBlank(message = Constants.EMPTY_NAME_MESSAGE)
    private String name;

    @NotBlank(message = Constants.EMPTY_DIRECTION_MESSAGE)
    private String direction;

    @NotNull(message = Constants.EMPTY_IDOWNER_MESSAGE)
    private Long idOwner;

    @Size(max = 13, message = Constants.INVALID_FORMAT_PHONE_MESSAGE)
    @Pattern(regexp = "^[+]?[0-9]*$", message = Constants.INVALID_FORMAT_PHONE_MESSAGE)
    private String phone;

    @NotBlank(message = Constants.EMPTY_URLLOGOTYPE_MESSAGE)
    private String urlLogotype;

    @NotBlank(message = Constants.EMPTY_NIT_MESSAGE)
    private String nit;


}
