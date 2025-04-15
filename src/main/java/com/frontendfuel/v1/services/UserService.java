package com.frontendfuel.v1.services;

import com.frontendfuel.v1.dto.UserDTO;
import com.frontendfuel.v1.entities.User;
import com.frontendfuel.v1.repositories.UserRepository;
import com.frontendfuel.v1.mappers.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<UserDTO> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(UserMapper::toDTO)
                .collect(Collectors.toList());
    }

    public UserDTO getUserById(String id) {
        User user = userRepository.findById(id).orElseThrow();
        return UserMapper.toDTO(user);
    }

    public UserDTO createUser(UserDTO userDTO) {
        User user = UserMapper.toEntity(userDTO);
        return UserMapper.toDTO(userRepository.save(user));
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }
}
