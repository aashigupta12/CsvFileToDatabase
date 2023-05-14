package com.freecharge.springbatchspringboot.model;

public class User {
    private long userId;
    private String namePrefix;
    private String firstName;

    public User(){

    }

    public User(long userId, String namePrefix, String firstName) {
        this.userId = userId;
        this.namePrefix = namePrefix;
        this.firstName = firstName;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
