package com.spring.boot.demo.controller;

import com.spring.boot.demo.Util.Code;
import com.spring.boot.demo.Util.CommonLogic;
import com.spring.boot.demo.Util.JsonUtils;
import com.spring.boot.demo.domain.User;
import com.spring.boot.demo.domain.toolsmodel.Constant;
import com.spring.boot.demo.domain.toolsmodel.JsonModel;
import com.spring.boot.demo.domain.toolsmodel.Receive;
import com.spring.boot.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;


@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    private Logger logger = Logger.getLogger("info");

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public void login(HttpServletRequest request, HttpServletResponse response) throws SQLException,IOException {
        logger.info("API-Login-Start");
        String param = Code.CodeChange(request, response);
       // Receive receive = (Receive) JsonUtils.getInstance().jsonStr2Object(param,Receive.class) ;
        Map<String, String> hashMap = JsonUtils.getInstance().jsonStr2HashMap(param);
        int id = Integer.parseInt(hashMap.get("userId"));

        List<User> list = userService.getUserById(id);
        JsonModel jm = new JsonModel();
        jm.setList(list);
        jm.setSize(list.size());
        response.getWriter().print(CommonLogic.jsonAssembly(Constant.ERROR_CODE,"查询成功",jm));
    }

}
