package com.prak.service;

import java.util.List;

import com.prak.entity.Book;

public interface BookService {
	List<Book> getAll();
	Book getById(Long bcode);
	Book add(Book book);
	Book update(Book book);
	void deleteById(Long id);
}
