package com.epam.mapstruct.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.epam.mapstruct.service.dto.FlattenUserDTO;
import com.epam.mapstruct.service.dto.UserDTO;
import com.epam.mapstruct.service.impl.UserService;

/**
 * Created by Adam_Skowron on 3/10/2017.
 */
@RestController
@RequestMapping("users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<List<UserDTO>> getUsers() {
        return new ResponseEntity<List<UserDTO>>(userService.getUsers(), HttpStatus.OK);
    }

    @RequestMapping(value = "/flattenList", method = RequestMethod.GET)
    public ResponseEntity<List<FlattenUserDTO>> getFlattenUsers() {
        return new ResponseEntity<List<FlattenUserDTO>>(userService.getFlattenUsers(), HttpStatus.OK);
    }


}
