package com.example.msuser.service;

import com.example.msuser.dao.UserEntity;
import com.example.msuser.dao.UserRepository;
import com.example.msuser.mapper.UserMapper;
import com.example.msuser.model.UserRequest;
import com.example.msuser.model.UserResponse;
import com.example.msuser.model.exception.NotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public UserResponse createUser(UserRequest request) {
        log.info("Creating user with email: {}", request.getEmail());

        if (userRepository.existsByEmail(request.getEmail())) {
            throw new IllegalArgumentException("User with email " + request.getEmail() + " already exists");
        }

        UserEntity userEntity = UserMapper.toEntity(request);
        UserEntity savedUser = userRepository.save(userEntity);

        log.info("User created successfully with id: {}", savedUser.getId());
        return UserMapper.toResponse(savedUser);
    }

    public UserResponse getUserById(Long id) {
        log.info("ActionLog.getUserById.start with user id# {}", id);
        UserEntity user = userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("USER_NOT_FOUND"));
        return UserMapper.toResponse(user);
    }

    public List<UserResponse> getAllUsers() {
        log.info("Getting all users");
        return userRepository.findAll().stream()
                .map(UserMapper::toResponse)
                .collect(Collectors.toList());
    }

    @Transactional
    public UserResponse updateUser(Long id, UserRequest request) {
        log.info("Updating user with id: {}", id);

        UserEntity user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("User not found with id: " + id));

        if (!user.getEmail().equals(request.getEmail()) &&
                userRepository.existsByEmail(request.getEmail())) {
            throw new IllegalArgumentException("User with email " + request.getEmail() + " already exists");
        }

        user.setName(request.getName());
        user.setSurname(request.getSurname());
        user.setEmail(request.getEmail());
        user.setPhone(request.getPhone());

        UserEntity updatedUser = userRepository.save(user);
        log.info("User updated successfully with id: {}", updatedUser.getId());
        return UserMapper.toResponse(updatedUser);
    }

    @Transactional
    public void deleteUser(Long id) {
        log.info("ActionLog.deleteUser.start with user id: {}", id);
        if (!userRepository.existsById(id)) {
            throw new IllegalArgumentException("User not found with id: " + id);
        }
        userRepository.deleteById(id);
        log.info("ActionLog.deleteUser.success with user id: {}", id);
    }
}
