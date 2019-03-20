package com.spring.boot.demo.Util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.*;

/**
 * @Author: JerryLiang
 * @Date: 2019/3/20 11:16
 **/


public class JsonUtils {

    private static Gson gson;
    private static JsonUtils jsonUtils;

    private JsonUtils() {
        gson = new Gson();
    }

    //获取实例
    public static JsonUtils getInstance() {
        System.out.println("getInstance-start");
        if (jsonUtils == null) {
            jsonUtils = new JsonUtils();

        }
        return jsonUtils;
    }

    // json 字符串转换成HashMap
    public Map<String,String> jsonStr2HashMap(String json) {

        System.out.println("jsonStr2HashMap-start");
        Map<String,String> map;
        try {
            map = gson.fromJson(json,new TypeToken<HashMap<String,String>>(){}.getType());
        } catch (Exception e) {
            System.out.println("jsonStr2HashMap-error");
            map = null;
        }
        return map;
    }

    // object 字符串转换成json
    public String objec2JsonStr(Object object) {
        System.out.println("objec2JsonStr-start");
        String jsonStr = null;
        try {
            jsonStr = gson.toJson(object);
        } catch (Exception e) {
            System.out.println("objec2JsonStr-error");
            jsonStr = null;
        }
        return jsonStr;
    }

    // json 字符串转换成object
    public Object jsonStr2Object(String json, Class className) {
        Object object = null;
        try {
            object = gson.fromJson(json, className);
        } catch (Exception e) {
            System.out.println("jsonStr2Object-error");
            object = null;
        }
        return object;
    }

}
