package com.spring.boot.demo.controller;

import com.spring.boot.demo.Util.Code;
import com.spring.boot.demo.domain.User;
import com.spring.boot.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;


@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    private Logger logger = Logger.getLogger("info");

    @RequestMapping(value = "/login")
    public void login(HttpServletRequest request, HttpServletResponse response) throws SQLException,IOException {
        logger.info("API-Login-Start");
        String param = Code.CodeChange(request, response);

        List<User> list = userService.getUserById(5);
        System.out.println(list.get(0).toString());


    }

}
