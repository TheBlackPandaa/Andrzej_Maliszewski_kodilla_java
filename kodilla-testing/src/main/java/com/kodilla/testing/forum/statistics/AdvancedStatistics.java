package com.kodilla.testing.forum.statistics;

public class AdvancedStatistics {
    private double userCount;
    private double postCount;
    private double commentCount;
    private double postPerUser;
    private double commentsPerUser;
    private double commentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        userCount = statistics.userNames().size();
        postCount = statistics.postCount();
        commentCount = statistics.commentsCount();
        if(userCount !=0) {
            postPerUser = postCount / userCount;
            commentsPerUser = commentCount / userCount;
        }else{
            postPerUser = 0;
            commentsPerUser = 0;
        }

        if(postCount == 0){
            commentsPerPost = 0;
        }else {
            commentsPerPost = commentCount / postCount;
        }
    }
    public void showStatistics(){
        System.out.println("User count: "+ userCount+" post count: "+postCount+" comment count: "+commentCount+" posts per user: "+postPerUser+" comments per user"+commentsPerUser+" comments per post"+commentsPerPost);
    }

    public double getUserCount() {
        return userCount;
    }

    public double getPostCount() {
        return postCount;
    }

    public double getCommentCount() {
        return commentCount;
    }

    public double getPostPerUser() {
        return postPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }
}
