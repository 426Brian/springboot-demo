package com.brian.sprbootdemo.service;

import com.brian.sprbootdemo.domain.User;

import java.util.List;

/**
 * Created by Brian in 13:35 2018/5/7
 */
public class AjaxResponseBody {
    String msg;
    List<User> users;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
