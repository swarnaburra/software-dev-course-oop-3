package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LibraryTests {
    @Test
    public void testBuildLibrary() {
        List<LibraryItem> library = new ArrayList<>();
        library.add(new Book("The Catcher in the Rye", 1951, "J.D. Salinger", 234));
        library.add(new Album("The Dark Side of the Moon", 1973, "Pink Floyd", 10));
        library.add(new Movie("The Dark Knight", 2008, "Christopher Nolan", 152));

        assertEquals(3, library.size());
        assertEquals("Book: The Catcher in the Rye by J.D. Salinger (1951) - 234 pages", library.get(0).toString());
        assertEquals("Album: The Dark Side of the Moon by Pink Floyd (1973) - 10 tracks", library.get(1).toString());
        assertEquals("Movie: The Dark Knight by Christopher Nolan (2008) - 152 minutes", library.get(2).toString());
    }
   // Negative Test Case

    @Test
    public void testLibraryItemNullTitleThrowsException() {
        try {
            // Try to create a LibraryItem with null title
            new LibraryItem(null, 2023, "Author Name");

            fail("Expected RuntimeException was not thrown");

        } catch (RuntimeException e) {

            // Check that the exception message matches exactly

            assertEquals("Title is Null ", e.getMessage());
        }
    }

    // Edge Case with invalid negative year

    @Test

    public void testLibraryItemNegativeYearThrowsException() {
        try {
            new LibraryItem("Book Title", -100, "Author Name");

            fail("Expected RuntimeException was not thrown");

        } catch (RuntimeException e) {
            assertEquals("Year cannot be negative", e.getMessage());
        }
    }
}
