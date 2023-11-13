package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies(){
        //Given
        Millenials millenials = new Millenials("Sir John");
        YGeneration yGeneration = new YGeneration("John");
        ZGeneration zGeneration = new ZGeneration("Johny");
        //When
        String millenialsPost = millenials.sharePost();
        String yGenerationPost = yGeneration.sharePost();
        String zGenerationPost = zGeneration.sharePost();
        //Then
        assertEquals("Sir John shared post with Facebook",millenialsPost);
        assertEquals("John shared post with Snapchat",yGenerationPost);
        assertEquals("Johny shared post with Twitter",zGenerationPost);
    }
    @Test
    void testIndividualSharingStrategy(){
        //Given
        Millenials millenials = new Millenials("Sir John");
        Millenials millenials1 = new Millenials("Sir John");
        Millenials millenials2 = new Millenials("Sir John");
        //When
        String noPublisherChange = millenials.sharePost();
        millenials1.setSocialPublisher(new SnapchatPublisher());
        String publisherChanged = millenials1.sharePost();
        millenials2.setSocialPublisher(new TwitterPublisher());
        String publisherChanged2 = millenials2.sharePost();
        //Then
        assertEquals("Sir John shared post with Facebook",noPublisherChange);
        assertEquals("Sir John shared post with Snapchat",publisherChanged);
        assertEquals("Sir John shared post with Twitter",publisherChanged2);
    }

}
