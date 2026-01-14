package org.example;

public class Movie extends LibraryItem {
    protected int durationInMinutes;

    public Movie(String title, int year, String author, int durationInMinutes) {

        super(title, year, author);

        if (title == null) {
            throw new RuntimeException("Title is Null ");
        }

        if (year > 2100) {
            throw new RuntimeException("The year is invalid ");
        }

        this.durationInMinutes = durationInMinutes;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    @Override
    public String toString() {

                return "Movie: " + title + " by " + author + " (" + year + ") - " + durationInMinutes + " minutes";
    }
}
