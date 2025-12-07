package com.example.msuser.mapper;

import com.example.msuser.dao.UserEntity;
import com.example.msuser.model.UserRequest;
import com.example.msuser.model.UserResponse;

public class UserMapper {

    public static UserEntity toEntity(UserRequest request) {
        return UserEntity.builder()
                .name(request.getName())
                .surname(request.getSurname())
                .email(request.getEmail())
                .phone(request.getPhone())
                .build();
    }

    public static UserResponse toResponse(UserEntity entity) {
        return UserResponse.builder()
                .id(entity.getId())
                .name(entity.getName())
                .surname(entity.getSurname())
                .email(entity.getEmail())
                .phone(entity.getPhone())
                .createdAt(entity.getCreatedAt())
                .updatedAt(entity.getUpdatedAt())
                .build();
    }
}

