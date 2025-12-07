package com.example.msuser.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Response object containing user information")
public class UserResponse {

    @Schema(description = "Unique identifier of the user", example = "1")
    private Long id;

    @Schema(description = "User's first name", example = "John")
    private String name;

    @Schema(description = "User's last name", example = "Doe")
    private String surname;

    @Schema(description = "User's email address", example = "john.doe@example.com")
    private String email;

    @Schema(description = "User's phone number", example = "+1234567890")
    private String phone;

    @Schema(description = "Timestamp when the user was created", example = "2024-12-07T10:30:00")
    private LocalDateTime createdAt;

    @Schema(description = "Timestamp when the user was last updated", example = "2024-12-07T15:45:00")
    private LocalDateTime updatedAt;
}

