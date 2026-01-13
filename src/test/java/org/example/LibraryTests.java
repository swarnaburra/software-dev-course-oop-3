package org.example;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LibraryTests {
    @Test
    public void testBuildLibrary() {
        List<LibraryItem> library = new ArrayList<>();
        library.add(new Book("The Catcher in the Rye", 1951,"J.D. Salinger", 234));
        library.add(new Album("The Dark Side of the Moon", 1973, "Pink Floyd", 10));
        library.add(new Movie("The Dark Knight", 2008,"Christopher Nolan", 152));

        assertEquals(3, library.size());
        assertEquals("Book: The Catcher in the Rye by J.D. Salinger (1951) - 234 pages", library.get(0).toString());
        assertEquals("Album: The Dark Side of the Moon by Pink Floyd (1973) - 10 tracks", library.get(1).toString());
        assertEquals("Movie: The Dark Knight by Christopher Nolan (2008) - 152 minutes", library.get(2).toString());
    }
}
