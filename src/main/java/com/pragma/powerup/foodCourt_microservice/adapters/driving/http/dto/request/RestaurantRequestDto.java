package com.pragma.powerup.foodCourt_microservice.adapters.driving.http.dto.request;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;


import static com.pragma.powerup.foodCourt_microservice.configuration.Constants.*;
import static com.pragma.powerup.foodCourt_microservice.configuration.Constants.EMPTY_URLLOGOTYPE_MESSAGE;

@AllArgsConstructor
@Getter
public class RestaurantRequestDto {


    @NotBlank(message = EMPTY_NAME_MESSAGE)
    @Pattern(regexp = "^(?=.*[a-zA-Z])([a-zA-Z0-9 ]+)$", message = INVALID_FORMAT_NAME_MESSAGE)
    @Schema(description = "The name of the restaurant.", example = "Sample Restaurant")
    private String name;

    @NotBlank(message = EMPTY_NIT_MESSAGE)
    @Pattern(regexp = "^[0-9]+$", message = INVALID_FORMAT_NIT_MESSAGE)
    @Schema(description = "The NIT (tax identification number) of the restaurant.", example = "123456789")
    private String nit;

    @NotBlank(message = EMPTY_DIRECTION_MESSAGE)
    @Schema(description = "The address or direction of the restaurant.", example = "123 Main Street")
    private String direction;

    @NotNull(message = EMPTY_IDOWNER_MESSAGE)
    @Schema(description = "The ID of the owner of the restaurant.", example = "1")
    private Long idOwner;

    @NotBlank(message = EMPTY_PHONE_MESSAGE)
    @Pattern(regexp = "^[0-9+]+$", message = INVALID_FORMAT_PHONE_MESSAGE)
    @Size(max = 13, message = INVALID_SIZE_PHONE_MESSAGE)
    @Schema(description = "The phone number of the restaurant.", example = "+1234567890")
    private String phone;

    @NotBlank(message = EMPTY_URLLOGOTYPE_MESSAGE)
    @Schema(description = "The URL of the restaurant's logotype.", example = "https://example.com/logo.png")
    private String urlLogotype;
}
