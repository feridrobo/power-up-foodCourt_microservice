package com.pragma.powerup.foodCourt_microservice.adapters.driving.http.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserRequestDto {
    private Long idPerson;
    private Long idRole;
}
