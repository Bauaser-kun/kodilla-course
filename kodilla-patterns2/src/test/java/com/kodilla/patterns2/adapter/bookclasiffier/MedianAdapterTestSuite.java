package com.kodilla.patterns2.adapter.bookclasiffier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    void publicationYearMedianAdapterTest(){
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> books = new HashSet<>();
        books.add(new Book("Kugune Maruyama", "Overlord 1 The undead King", 2012, "Overlord1"));
        books.add(new Book("Terry Pratchet", "Shepheard Crown", 2015, "Discworld42"));
        books.add(new Book("J. K. Rowling", "Harry Potter and the philosopher Stone", 1997, "HarryPotter1"));
        books.add(new Book("Aneta Jadowska", "Dynia i Jemioła. Nietypowe historie świąteczne", 2019, "JadOp3"));

        //When
        double median = medianAdapter.publicationYearMedian(books);

        //Then
        assertEquals(2015, median, 0);

    }
}
