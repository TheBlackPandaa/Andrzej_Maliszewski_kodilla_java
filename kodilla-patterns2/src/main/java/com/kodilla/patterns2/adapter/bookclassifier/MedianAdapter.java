package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.BookA;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;

import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<BookA> bookSet) {
        Map<BookSignature, BookB> books = new HashMap<>();
        for(BookA bookA:bookSet){
            books.put(new BookSignature(bookA.getSignature()), new BookB(bookA.getAuthor(), bookA.getTitle(), bookA.getPublicationYear()));
        }
        return medianPublicationYear(books);
    }
}
