package org.example;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTests {
    @Test
    public void testCreateMovie() {
        Movie movie = new Movie("The Dark Knight", 2008, "Christopher Nolan", 152);
        assertEquals("The Dark Knight", movie.getTitle());
        assertEquals("Christopher Nolan", movie.getAuthor());
        assertEquals(2008, movie.getYear());
        assertEquals(152, movie.getDurationInMinutes());
    }

    @Test
    public void testMovieToString() {
        Movie movie = new Movie("The Dark Knight",2008, "Christopher Nolan", 152);
        assertEquals("Movie: The Dark Knight by Christopher Nolan (2008) - 152 minutes", movie.toString());
    }
}
