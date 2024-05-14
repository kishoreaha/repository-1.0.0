package com.example.springboottutorial.model;

public class Book {
    Integer bookId;
    String bookName;
    String bookAauthor;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAauthor() {
        return bookAauthor;
    }

    public void setBookAauthor(String bookAauthor) {
        this.bookAauthor = bookAauthor;
    }
}
