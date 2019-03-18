package com.spring.boot.demo.mapper;

import com.spring.boot.demo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {


    List<User> getUserById(int id);
}
