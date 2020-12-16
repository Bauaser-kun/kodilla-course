package com.kodilla.patterns.Strategy.social;

public class User {
    private final String name;
    protected SocialPublisher socialPublisher;

    public String getName() {
        return name;
    }

    public User(String name) {
        this.name = name;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
