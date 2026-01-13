package org.example;

public class Book extends LibraryItem {
    protected int pageCount;

    public Book(String title, int year, String author, int pageCount) {
        super(title, year, author);
        this.pageCount = pageCount;
    }

    public int getPageCount() {

        return pageCount;
    }


    @Override
    public String toString() {
        return "Book: " + title + " by " + author + " (" + year + ") - " + pageCount + " pages";
    }

    public void readBook() {
        System.out.println("Reading " + title + " by " + author + "...\n" +
                "Done!");
    }
}
