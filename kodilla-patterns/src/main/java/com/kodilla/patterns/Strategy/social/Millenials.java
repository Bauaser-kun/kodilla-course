package com.kodilla.patterns.Strategy.social;

public class Millenials extends User {
    public Millenials(String name) {
        super(name);
        this.socialPublisher = new FacebookPublisher();
    }
}
