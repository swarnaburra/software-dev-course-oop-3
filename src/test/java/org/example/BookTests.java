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
}
