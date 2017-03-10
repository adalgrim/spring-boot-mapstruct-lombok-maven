package com.epam.mapstruct.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.mapstruct.dao.impl.UserRepository;
import com.epam.mapstruct.service.dto.FlattenUserDTO;
import com.epam.mapstruct.service.dto.UserDTO;
import com.epam.mapstruct.service.mapper.UserMapper;

/**
 * Created by Adam_Skowron on 3/10/2017.
 */
@Service
public class UserService {

    private UserRepository userRepository;

    private UserMapper userMapper;

    @Autowired
    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public List<UserDTO> getUsers() {
        return userMapper.mapToUsers(userRepository.getUsers());
    }

    public List<FlattenUserDTO> getFlattenUsers() {
        return userRepository.getUsers()
                .stream()
                .map(user -> userMapper.mapToFlattenUser(user))
                .collect(Collectors.toList());
    }

}
