package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.Strategy.social.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies(){
        //Given
        User red = new Millenials("Pokemon trainer Red");
        User blue = new YGeneration("Pokemon trainer Blue");
        User green = new ZGeneration("Pokemon trainer Green");

        //When
        String redShares = red.sharePost();
        System.out.println("I'm Red and " + redShares);
        String blueShares = blue.sharePost();
        System.out.println("I'm Blue and " + blueShares);
        String greenShares = green.sharePost();
        System.out.println("I'm Green and " + greenShares);

        //Then
        assertEquals("I'm using Facebook!", redShares);
        assertEquals("I'm using Twitter!", blueShares);
        assertEquals("I'm using Snapchat!", greenShares);
    }

    @Test
    void testIndividualSharingStrategies(){
        //Given
        User red = new Millenials("Pokemon trainer Red");

        //When
        String redShares = red.sharePost();
        System.out.println("I'm Red and " + redShares);
        red.setSocialPublisher(new TwitterPublisher());
        redShares = red.sharePost();
        System.out.println("I'm Red and now " + redShares);

        //Then
       assertEquals("I'm using Twitter!", redShares );
    }
}
