package com.spring.boot.demo.serviceImpl;

import com.spring.boot.demo.domain.User;
import com.spring.boot.demo.mapper.UserMapper;
import com.spring.boot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

        @Autowired
        private UserMapper userMapper;

        @Override
        public List<User> getUserById(int id) {
                return userMapper.getUserById(id);
        }
}
