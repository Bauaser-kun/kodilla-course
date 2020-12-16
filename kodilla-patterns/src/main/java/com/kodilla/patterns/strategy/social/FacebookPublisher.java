package com.kodilla.patterns.strategy.social;

public class FacebookPublisher implements SocialPublisher {
    public String socialPublisherName = "Facebook";

    @Override
    public String share() {
        return "I'm using " + socialPublisherName + "!";
    }
}
