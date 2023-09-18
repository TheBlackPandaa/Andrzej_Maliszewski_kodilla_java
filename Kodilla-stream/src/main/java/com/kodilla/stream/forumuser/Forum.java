package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum(){
        //LocalDate date1 =  LocalDate.parse("1998-06-01");
        userList.add(new ForumUser(111,"user1",'M', LocalDate.parse("1998-06-01"),0));
        userList.add(new ForumUser(112,"user2",'M', LocalDate.parse("1997-01-02"),2));
        userList.add(new ForumUser(113,"user3",'F', LocalDate.parse("2000-05-21"),0));
        userList.add(new ForumUser(121,"user4",'M', LocalDate.parse("1999-07-17"),1));
        userList.add(new ForumUser(122,"user5",'F', LocalDate.parse("2002-11-29"),0));
        userList.add(new ForumUser(123,"user6",'M', LocalDate.parse("2004-12-31"),3));
        userList.add(new ForumUser(131,"user7",'F', LocalDate.parse("2006-01-12"),0));
        userList.add(new ForumUser(132,"user8",'M', LocalDate.parse("2008-02-19"),2));
        userList.add(new ForumUser(133,"user9",'F', LocalDate.parse("2010-08-25"),0));
        userList.add(new ForumUser(211,"user10",'M', LocalDate.parse("1990-12-16"),10));
        userList.add(new ForumUser(212,"user11",'F', LocalDate.parse("1993-10-25"),0));
        }
    public List<ForumUser> getList() {return new ArrayList<>(userList);}
}
