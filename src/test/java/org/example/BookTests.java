package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTests {
    @Test
    public void testCreateBook() {
        Book book = new Book("The Catcher in the Rye", 1951,"J.D. Salinger", 234);
        assertEquals("The Catcher in the Rye", book.getTitle());
        assertEquals("J.D. Salinger", book.getAuthor());
        assertEquals(1951, book.getYear());
        assertEquals(234, book.getPageCount());
    }

    @Test
    public void testBookToString() {
        Book book = new Book("The Catcher in the Rye", 1951, "J.D. Salinger", 234);
        assertEquals("Book: The Catcher in the Rye by J.D. Salinger (1951) - 234 pages", book.toString());
    }


    @Test
    public void testReadBook() {
        Book book = new Book("The Catcher in the Rye", 1951, "J.D. Salinger", 234);
        book.readBook();
    }

    //Negative Test Case

    @Test
    public void testBookToStringTitleIsNull() {
        try {
            Book book = new Book(null, 1973, "Pink Floyd", 10);
            book.toString();

            fail("Expected RuntimeException was not thrown");

        } catch (RuntimeException e){
            assertEquals("Wrong Exception message", "Title is Null " , e.getMessage());
        }
    }

    //Edge case with year is future year

    @Test
    public void testBookToStringYearIsInvalid() {
        try {
            Book book = new Book("The Dark Knight", 3000, "Christopher Nolan", 152);

           book.toString();

            fail("Expected RuntimeException was not thrown");

        } catch (RuntimeException e) {
            assertEquals("Wrong Exception message", "The year is invalid ", e.getMessage());
        }

    }}
