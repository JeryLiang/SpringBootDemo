package com.spring.boot.demo.service;

import com.spring.boot.demo.domain.User;

import java.util.List;


public interface UserService {

    List<User> getUserById(int id);

}
