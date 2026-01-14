package org.example;

public class LibraryItem {
    protected String title;
    protected int year;
    protected String author;

    public LibraryItem(String title, int year, String author) {

        if (title == null) {

            throw new RuntimeException("Title is Null ");
        }

        if (year < 0) {

            throw new RuntimeException("Year cannot be negative");
        }

        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String getTitle() {

        return title;
    }

    public int getYear() {

        return year;
    }

    public String getAuthor() {

        return author;
    }

    @Override
    public String toString() {
        return "Item:" + title + " by " + author + " (" + year + ") ";
    }
}
