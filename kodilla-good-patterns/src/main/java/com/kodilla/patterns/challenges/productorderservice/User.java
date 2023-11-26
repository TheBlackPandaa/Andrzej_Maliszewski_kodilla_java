package com.kodilla.patterns.challenges.productorderservice;

public class User {
    private String userName;
    private String userSurname;

    public User(String name, String surname) {
        this.userName = name;
        this.userSurname = surname;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userSurname='" + userSurname + '\'' +
                '}';
    }
}
