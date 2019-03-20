package com.spring.boot.demo.domain.toolsmodel;



/**
 * @Author: JerryLiang
 * @Date: 2019/3/20 11:30
 **/
public class BPResult {
    private String code;
    private String message;
    Object contents;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getContents() {
        return contents;
    }

    public void setContents(Object contents) {
        this.contents = contents;
    }
}
