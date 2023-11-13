package com.kodilla.patterns.strategy.social;

public sealed class User
        permits Millenials, YGeneration, ZGeneration {

    public final String User;

    protected SocialPublisher socialPublisher;

    public User(String user) {
        User = user;
    }

    public void setSocialPublisher (SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    public String share(){
        return socialPublisher.share();
    }

    public String sharePost(){
        return User + " shared post with " + share();
    }
}
