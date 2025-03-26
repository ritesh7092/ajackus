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

}
