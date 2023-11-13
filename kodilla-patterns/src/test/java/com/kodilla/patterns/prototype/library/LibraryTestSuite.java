package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {

    @Test
    void testGetBooks(){
        //Given
        Library library = new Library("Library one");
        IntStream.iterate(1,n -> n+1)
                .limit(10)
                .forEach(n -> library.books.add(new Book("title " + n, "author " + n, LocalDate.of(n,n,n))));
        int books = library.books.size();
        //When
        Library clonnedLibrary = null;
        try{
            clonnedLibrary = library.shallowCopy();
            clonnedLibrary.setName("Library two");
        }catch(CloneNotSupportedException e){
            System.out.println(e);
        }
        Library deepClonnedLibrary = null;
        try{
            deepClonnedLibrary = library.deepCopy();
            deepClonnedLibrary.setName("Library three");
        }catch(CloneNotSupportedException e){
            System.out.println(e);
        }

        int books2 = clonnedLibrary.books.size();
        int books3 = deepClonnedLibrary.books.size();
        library.getBooks().clear();
        //Then
        assertEquals(0,library.getBooks().size());
        assertEquals(0,clonnedLibrary.getBooks().size());
        assertEquals(10,deepClonnedLibrary.getBooks().size());

    }

}
