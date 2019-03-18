package com.spring.boot.demo.domain;

public class User {
    private int id;
    private String username;
    private String password;
    private String note;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "[ id: " + id + "\n" + "username: "+ username + "\n" + "password: "+password + "\n" + "note: "+note+"]";
    }
}
