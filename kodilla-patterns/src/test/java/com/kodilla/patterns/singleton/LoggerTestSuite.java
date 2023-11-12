package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    @Test
    void getLastLogTest(){
        //Given
        String log = "Test log";
        Logger logger = Logger.INSTANCE;
        //When
        logger.log(log);
        //Then
        assertEquals("Test log",logger.getLastLog());
    }

}
