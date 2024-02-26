package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.BookA;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class TestMedianAdapter {

    @Test
    public void MedianAdapterTest(){
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<BookA> bookASet = new HashSet<>() {
            {
                add(new BookA("author1", "title1", 1, "sig1"));
                add(new BookA("author2", "title2", 2, "sig2"));
                add(new BookA("author3", "title3", 3, "sig3"));
            }
        };
        //When
        int median = medianAdapter.publicationYearMedian(bookASet);
        //Then
        assertEquals(2,median);
    }
}
