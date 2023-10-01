package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class calculateAdvStatisticsTestSuite {
    @Mock
    private Statistics statisticsMock;
    private List<String> generateListOfUsers(int userQuantity) {
        List<String> userNames = new ArrayList<>();
        for (int n = 1; n <= userQuantity; n++) {
            String user = ("username" + n);
            userNames.add(user);
        }
        return userNames;
    }
    @DisplayName("When post count is 0")
    @Test
    void postCountIs0(){
        //Given
        AdvancedStatistics advancedStatistics = new AdvancedStatistics();
        when(statisticsMock.userNames()).thenReturn(generateListOfUsers(20));
        when(statisticsMock.postCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(20);
        //When
        advancedStatistics.calculateAdvStatistics(statisticsMock);
        double userAvarage = advancedStatistics.getPostPerUser();
        double commentsPerUser = advancedStatistics.getCommentsPerUser();
        double commentsPerPost = advancedStatistics.getCommentsPerPost();
        //Then
        assertEquals(0,userAvarage);
        assertEquals(1,commentsPerUser);
        assertEquals(0,commentsPerPost);
    }
    @DisplayName("When post count is 1000")
    @Test
    void postCountIs1000(){
        //Given
        AdvancedStatistics advancedStatistics = new AdvancedStatistics();
        when(statisticsMock.userNames()).thenReturn(generateListOfUsers(20));
        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(20);
        //WHen
        advancedStatistics.calculateAdvStatistics(statisticsMock);
        double userAvarage = advancedStatistics.getPostPerUser();
        double commentsPerUser = advancedStatistics.getCommentsPerUser();
        double commentsPerPost = advancedStatistics.getCommentsPerPost();
        //Then
        assertEquals(50,userAvarage);
        assertEquals(1,commentsPerUser);
        assertEquals(0.02,commentsPerPost);
    }
    @DisplayName("When post count is 0")
    @Test
    void commentCountIs0(){
        //Given
        AdvancedStatistics advancedStatistics = new AdvancedStatistics();
        when(statisticsMock.userNames()).thenReturn(generateListOfUsers(20));
        when(statisticsMock.postCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        advancedStatistics.calculateAdvStatistics(statisticsMock);
        double userAvarage = advancedStatistics.getPostPerUser();
        double commentsPerUser = advancedStatistics.getCommentsPerUser();
        double commentsPerPost = advancedStatistics.getCommentsPerPost();
        //Then
        assertEquals(1,userAvarage);
        assertEquals(0,commentsPerUser);
        assertEquals(0,commentsPerPost);
    }
    @DisplayName("When comment count is higher than post count")
    @Test
    void commentsMoreThanPosts(){
        //Given
        AdvancedStatistics advancedStatistics = new AdvancedStatistics();
        when(statisticsMock.userNames()).thenReturn(generateListOfUsers(20));
        when(statisticsMock.postCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(100);
        //WHen
        advancedStatistics.calculateAdvStatistics(statisticsMock);
        double userAvarage = advancedStatistics.getPostPerUser();
        double commentsPerUser = advancedStatistics.getCommentsPerUser();
        double commentsPerPost = advancedStatistics.getCommentsPerPost();
        //Then
        assertEquals(1,userAvarage);
        assertEquals(5,commentsPerUser);
        assertEquals(5,commentsPerPost);
    }
    @DisplayName("When post count is higher than comment count")
    @Test
    void PostsMoreThanComments(){
        //Given
        AdvancedStatistics advancedStatistics = new AdvancedStatistics();
        when(statisticsMock.userNames()).thenReturn(generateListOfUsers(20));
        when(statisticsMock.postCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(20);
        //WHen
        advancedStatistics.calculateAdvStatistics(statisticsMock);
        double userAvarage = advancedStatistics.getPostPerUser();
        double commentsPerUser = advancedStatistics.getCommentsPerUser();
        double commentsPerPost = advancedStatistics.getCommentsPerPost();
        //Then
        assertEquals(5,userAvarage);
        assertEquals(1,commentsPerUser);
        assertEquals(0.2,commentsPerPost);
    }
    @DisplayName("When user count is 0")
    @Test
    void userCountIs0(){
        //Given
        AdvancedStatistics advancedStatistics = new AdvancedStatistics();
        when(statisticsMock.userNames()).thenReturn(generateListOfUsers(0));
        when(statisticsMock.postCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(20);
        //When
        advancedStatistics.calculateAdvStatistics(statisticsMock);
        double userAvarage = advancedStatistics.getPostPerUser();
        double commentsPerUser = advancedStatistics.getCommentsPerUser();
        double commentsPerPost = advancedStatistics.getCommentsPerPost();
        //Then
        assertEquals(0,userAvarage);
        assertEquals(0,commentsPerUser);
        assertEquals(1,commentsPerPost);
    }
    @DisplayName("When user count is 1000")
    @Test
    void userCountIs1000(){
        //Given
        AdvancedStatistics advancedStatistics = new AdvancedStatistics();
        when(statisticsMock.userNames()).thenReturn(generateListOfUsers(1000));
        when(statisticsMock.postCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(20);
        //WHen
        advancedStatistics.calculateAdvStatistics(statisticsMock);
        double userAvarage = advancedStatistics.getPostPerUser();
        double commentsPerUser = advancedStatistics.getCommentsPerUser();
        double commentsPerPost = advancedStatistics.getCommentsPerPost();
        //Then
        assertEquals(0.02,userAvarage);
        assertEquals(0.02,commentsPerUser);
        assertEquals(1,commentsPerPost);
    }
}

