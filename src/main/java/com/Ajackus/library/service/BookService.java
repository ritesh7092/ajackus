package com.Ajackus.library.service;

import com.Ajackus.library.model.Book;
import com.Ajackus.library.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepo bookRepo;

    public Book addBook(Book book){
        if (!"Available".equalsIgnoreCase(book.getAvailabilityStatus()) &&
                !"Checked Out".equalsIgnoreCase(book.getAvailabilityStatus())) {
            throw new IllegalArgumentException("Availability status must be 'Available' or 'Checked Out' ");
        }
        if (bookRepo.existsById(book.getBookId())) {
            throw new IllegalArgumentException("Book ID must be unique");
        }
        return bookRepo.save(book);
    }
}
