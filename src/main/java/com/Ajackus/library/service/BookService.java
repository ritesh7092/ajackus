package com.Ajackus.library.service;

import com.Ajackus.library.model.Book;
import com.Ajackus.library.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepo bookRepo;

    public Book addBook(Book book){
        if (!"Available".equalsIgnoreCase(book.getAvailabilityStatus()) &&
                !"Checked Out".equalsIgnoreCase(book.getAvailabilityStatus())) {
            throw new IllegalArgumentException("Availability status must be either 'Available' or 'Checked Out' enter again correctly");
        }

        if (bookRepo.existsById(book.getBookId())) {
            throw new IllegalArgumentException("Book ID must be unique enter different BookId");
        }
        return bookRepo.save(book);
    }

    public List<Book> findAllBooks() {
        return bookRepo.findAll();
    }

    public Optional<Book> findBookById(String bookId) {
        return bookRepo.findById(bookId);
    }

    public Optional<Book> findBookByTitle(String title) {
        return bookRepo.findByTitle(title);
    }

    public Book updateBook(String bookId, Book updatedBook) {
        return bookRepo.findById(bookId)
                .map(existingBook -> {
                    existingBook.setTitle(updatedBook.getTitle());
                    existingBook.setAuthor(updatedBook.getAuthor());
                    existingBook.setGenre(updatedBook.getGenre());
                    existingBook.setAvailabilityStatus(updatedBook.getAvailabilityStatus());
                    return bookRepo.save(existingBook);
                })
                .orElseThrow(() -> new IllegalArgumentException("Book not found with ID: " + bookId + "Enter correct bookId"));
    }

    public void deleteBook(String bookId) {
        if (!bookRepo.existsById(bookId)) {
            throw new IllegalArgumentException("Book not found with ID: " + bookId + "Enter correct bookId");
        }
        bookRepo.deleteById(bookId);
    }
}
