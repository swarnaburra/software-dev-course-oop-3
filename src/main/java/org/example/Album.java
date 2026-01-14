package org.example;

public class Album extends LibraryItem {
    protected int trackCount;


    public Album(String title, int year, String author, int trackCount) {
        super(title, year, author);
        this.trackCount = trackCount;

    }

    public int getTrackCount() {
        return trackCount;
    }

    @Override
    public String toString() {

        if (title == null) {
            throw new RuntimeException("Title is Null ");
        }

        if (year > 2000) {
            throw new RuntimeException("The year is invalid ");
        }

        return "Album: " + title + " by " + author + " (" + year + ") - " + trackCount + " tracks";
    }

}
