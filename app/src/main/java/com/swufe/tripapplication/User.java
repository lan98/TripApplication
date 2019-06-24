package com.swufe.tripapplication;

import java.io.Serializable;

public class User implements Serializable {

    private int id;
    private String username;
    private String password;
    private int age;
    private String sex;

    public User() {
    }

    public User(String username, String password, int age, String sex) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.sex = sex;
    }
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String toString() {
        return "User [id=" + this.id + ", username=" + this.username + ", password=" + this.password + ", age=" + this.age + ", sex=" + this.sex + "]";
    }
}
