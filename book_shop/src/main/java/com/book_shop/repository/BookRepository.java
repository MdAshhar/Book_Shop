package com.book_shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book_shop.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
