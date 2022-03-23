package com.example.srvlibrairie.controllers;

import com.example.srvlibrairie.utils.DTO.AuteurDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AuteurController {
    @GetMapping("/auteurs")
    public List<AuteurDTO> getAllUsers() {
//        List<User> users = service.getAllUsers();
        List<AuteurDTO> usersDTO = new ArrayList<>();
//
//        for (User user : users) {
//            usersDTO.add(mapper.toUserDTO(user));
//        }
//
        return usersDTO;
    }
}
