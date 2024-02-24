package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class HomeWorkTestSuite {
    @Test
    public void testObserver(){
        //Given
        StudentQueue queue1 = new StudentQueue("queue1");
        StudentQueue queue2 = new StudentQueue("queue2");
        StudentQueue queue3 = new StudentQueue("queue3");
        Mentor mentor1 = new Mentor("mentor1");
        Mentor mentor2 = new Mentor("mentor2");
        Mentor mentor3 = new Mentor("mentor3");
        queue1.registerObserver(mentor1);
        queue1.registerObserver(mentor2);
        queue2.registerObserver(mentor2);
        queue2.registerObserver(mentor3);
        queue3.registerObserver(mentor1);
        queue3.registerObserver(mentor2);
        queue3.registerObserver(mentor3);
        //When
        queue1.addTask("task1");
        queue1.addTask("task2");
        queue2.addTask("task1");
        queue3.addTask("task1");
        queue3.addTask("task2");
        queue3.addTask("task3");
        //Then
        assertEquals(5,mentor1.getUpdateCount());
        assertEquals(6,mentor2.getUpdateCount());
        assertEquals(4,mentor3.getUpdateCount());
    }
}
