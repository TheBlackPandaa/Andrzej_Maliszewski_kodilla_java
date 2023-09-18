package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    final private int userID;
    final private String userName;
    final private char sex;
    final private LocalDate birthDate;
    final private int posts;

    public ForumUser(final int userID, final String userName, final char sex, final LocalDate birthDate, final int posts) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.posts = posts;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", posts=" + posts +
                '}';
    }
}
