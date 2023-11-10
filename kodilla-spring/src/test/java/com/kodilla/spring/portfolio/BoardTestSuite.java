package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class BoardTestSuite {

    @Test
    void testContext() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");

        //When & Then
        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");
    }

    @Test
    void testAsString(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);
        //When&Then
        System.out.println(board.toString());
    }

    @Test
    void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);
        //When
        board.toDoList.tasks.add("new task");
        board.inProgressList.tasks.add("new task");
        board.doneList.tasks.add("new task");
        //Then
        assertEquals("[new task]",board.doneList.tasks.toString());
        assertEquals("[new task]",board.toDoList.tasks.toString());
        assertEquals("[new task]",board.inProgressList.tasks.toString());

    }
}
