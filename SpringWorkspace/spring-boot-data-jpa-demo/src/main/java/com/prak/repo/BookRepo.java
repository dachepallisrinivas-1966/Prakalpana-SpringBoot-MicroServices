package com.prak.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prak.entity.Book;

public interface BookRepo extends JpaRepository<Book, Long> {

}
