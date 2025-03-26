package com.Ajackus.library.controller;

import com.Ajackus.library.model.Book;
import com.Ajackus.library.service.BooksService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BooksController {
    @Autowired
    private BooksService booksService;

    @PostMapping
    public ResponseEntity<Book> addBook(@Valid @RequestBody Book book) {
        Book savedBook = booksService.addBook(book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = booksService.findAllBooks();
        return ResponseEntity.ok(books);
    }

    @GetMapping("/id/{bookId}")
    public ResponseEntity<Book> getBookById(@PathVariable String bookId) {
        return booksService.findBookById(bookId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/title/{title}")
    public ResponseEntity<Book> getBookByTitle(@PathVariable String title) {
        return booksService.findBookByTitle(title)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{bookId}")
    public ResponseEntity<Book> updateBookByBookId(
            @PathVariable String bookId,
            @Valid @RequestBody Book book
    ) {
        Book updatedBook = booksService.updateBook(bookId, book);
        return ResponseEntity.ok(updatedBook);
    }

    @DeleteMapping("/{bookId}")
    public ResponseEntity<Void> deleteBookById(@PathVariable String bookId) {
        booksService.deleteBook(bookId);
        return ResponseEntity.noContent().build();
    }
}
