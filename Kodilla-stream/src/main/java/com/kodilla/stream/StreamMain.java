package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum theForum = new Forum();
        LocalDate currentDate = LocalDate.now();
        Map<Integer,ForumUser> par = theForum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthDate().isBefore(currentDate.minusYears(20)))
                .filter(forumUser -> forumUser.getPosts() > 1)
                .collect(Collectors.toMap(ForumUser::getUserID,forumUser -> forumUser));

        par.entrySet().stream()
                .map(entry->entry.getKey()+ ": " +entry.getValue())
                .forEach(System.out::println);
    }
}
