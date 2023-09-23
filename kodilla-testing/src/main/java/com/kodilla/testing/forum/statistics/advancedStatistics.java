package com.kodilla.testing.forum.statistics;

public class advancedStatistics {
    private int userCount;
    private int postCount;
    private int commentCount;
    private double postPerUser;
    private double commentsPerUser;
    private double commentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        userCount = statistics.userNames().size();
        postCount = statistics.postCount();
        commentCount = statistics.commentsCount();
        postPerUser = postCount / userCount;
        commentsPerPost = commentCount / postCount;
        commentsPerUser = commentCount / userCount;
    }
    public void showStatistics(){
        System.out.println("User count: "+ userCount+" post count: "+postCount+" comment count: "+commentCount+" posts per user: "+postPerUser+" comments per user"+commentsPerUser+" comments per post"+commentsPerPost);
    }
}
