package com.learn.testspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "user_whitelist")
public class UserWhiteList {

    @Column(name = "user_id")
    @Id
    private String userId;
    @Column(name = "uen")
    private String uen;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUen() {
        return uen;
    }

    public void setUen(String uen) {
        this.uen = uen;
    }

}