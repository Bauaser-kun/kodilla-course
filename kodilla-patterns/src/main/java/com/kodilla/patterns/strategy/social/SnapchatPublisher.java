package com.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher {
    public String socialPublisherName = "Snapchat";

    @Override
    public String share() {
        return "I'm using " + socialPublisherName + "!";
    }
}
