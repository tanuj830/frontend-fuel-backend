package com.frontendfuel.v1.mappers;

import com.frontendfuel.v1.dto.UserDTO;
import com.frontendfuel.v1.entities.User;

public class UserMapper {
    public static UserDTO toDTO(User user) {
        return UserDTO.builder()
                .id(user.getId())
                .username(user.getUsername())
                .email(user.getEmail())
                .build();
    }

    public static User toEntity(UserDTO dto) {
        return User.builder()
                .id(dto.getId())
                .username(dto.getUsername())
                .email(dto.getEmail())
                .build();
    }
}
