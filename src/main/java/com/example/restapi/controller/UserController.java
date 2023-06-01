package com.example.restapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.model.User;
import com.example.restapi.repository.UserRepository;


@RestController
@RequestMapping("/users")
public class UserController {
  
  private UserRepository repository;

  @GetMapping
  public List<User> list() {
    return repository.findAll();
    }
}
