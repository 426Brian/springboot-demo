package com.brian.sprbootdemo.service;

import javax.validation.constraints.NotBlank;

/**
 * Created by Brian in 13:38 2018/5/7
 */
public class SearchCriteria {
    @NotBlank(message = "username can't be empty")
    String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "SearchCriteria{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
