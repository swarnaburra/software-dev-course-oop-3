package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlbumTests {
    @Test
    public void testCreateAlbum() {
        Album album = new Album("The Dark Side of the Moon", 1973, "Pink Floyd", 10);
        assertEquals("The Dark Side of the Moon", album.getTitle());
        assertEquals("Pink Floyd", album.getAuthor());
        assertEquals(1973, album.getYear());
        assertEquals(10, album.getTrackCount());
    }

    @Test
    public void testAlbumToString() {
        Album album = new Album("The Dark Side of the Moon", 1973, "Pink Floyd", 10);
        assertEquals("Album: The Dark Side of the Moon by Pink Floyd (1973) - 10 tracks", album.toString());
    }

    // Negative Test

    @Test
    public void testAlbumToStringTitleIsNull() {
        try {
            Album album = new Album(null, 1973, "Pink Floyd", 10);
            album.toString();

            fail("Expected RuntimeException was not thrown");

        } catch (RuntimeException e) {
            assertEquals("Wrong Exception message", "Title is Null ", e.getMessage());
        }
    }

    //Edge case with year is future year

    @Test
    public void testAlbumToStringYearIsInvalid() {
        try {
            Album album = new Album("The Dark Knight", 3000, "Christopher Nolan", 152);

            album.toString();

            fail("Expected RuntimeException was not thrown");

        } catch (RuntimeException e) {
            assertEquals("Wrong Exception message", "The year is invalid ", e.getMessage());
        }

    }
}