package com.stackroute.redispoc.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@RedisHash("users")
public class User implements Serializable {
    @Id
    private String userId;
    private String userName;
    private Long salary;


    public User(String userId, String userName, Long salary) {
        this.userId = userId;
        this.userName = userName;
        this.salary = salary;
    }

    public User() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

}
