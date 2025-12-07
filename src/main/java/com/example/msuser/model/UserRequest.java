package com.example.msuser.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Request object for creating or updating a user")
public class UserRequest {

    @Schema(description = "User's first name", example = "John", required = true)
    private String name;

    @Schema(description = "User's last name", example = "Doe", required = true)
    private String surname;

    @Schema(description = "User's email address", example = "john.doe@example.com", required = true)
    private String email;

    @Schema(description = "User's phone number", example = "+1234567890")
    private String phone;
}

