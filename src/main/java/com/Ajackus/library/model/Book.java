package com.Ajackus.library.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Book {
    @Id
    @NotBlank(message = "BookID can not be blank!")
    private String bookId;

    public @NotBlank(message = "BookID can not be blank!") String getBookId() {
        return bookId;
    }

    public void setBookId(@NotBlank(message = "BookID can not be blank!") String bookId) {
        this.bookId = bookId;
    }

    public @NotBlank(message = "Title can not be blank!") String getTitle() {
        return title;
    }

    public void setTitle(@NotBlank(message = "Title can not be blank!") String title) {
        this.title = title;
    }

    public @NotBlank(message = "Author can not be blank!") String getAuthor() {
        return author;
    }

    public void setAuthor(@NotBlank(message = "Author can not be blank!") String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    @NotBlank(message = "Title can not be blank!")
    private String title;

    @NotBlank(message = "Author can not be blank!")
    private String author;
    private String genre;
    private String availabilityStatus;
}
