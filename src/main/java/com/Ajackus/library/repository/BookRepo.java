package com.Ajackus.library.repository;

import com.Ajackus.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepo extends JpaRepository<Book, String> {
    Optional<Book> findByTitle(String title);
}
