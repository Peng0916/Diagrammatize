package com.newer.movie.pojo;

import java.io.Serializable;

/**
 * Created by SONG on 2016/3/24.
 */
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private Integer imgUser;

    public User() {
    }

    public User(Integer id, String username, String password, Integer imgUser) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.imgUser = imgUser;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getImgUser() {
        return imgUser;
    }

    public void setImgUser(Integer imgUser) {
        this.imgUser = imgUser;
    }
}
