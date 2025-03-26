package com.Ajackus.library.repository;

import com.Ajackus.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, String> {
}
