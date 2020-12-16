package com.kodilla.patterns.Strategy.social;

public class TwitterPublisher implements SocialPublisher {
    public String socialPublisherName = "Twitter";

    @Override
    public String share() {
        return "I'm using " + socialPublisherName + "!";
    }
}
