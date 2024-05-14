package com.example.springboottutorial.model;

public record LibraryEvent (
    Integer libraryEventId,
    LibraryEventType libraryEventType,
    Book book
){

}
