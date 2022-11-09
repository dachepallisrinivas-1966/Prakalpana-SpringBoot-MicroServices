package com.prak.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prak.entity.Book;
import com.prak.repo.BookRepo;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepo repo;
	
	@Override
	public List<Book> getAll() {
		return repo.findAll();
	}

	@Override
	public Book getById(Long bcode) {
		return repo.findById(bcode).orElse(null);
	}

	@Override
	public Book add(Book book) {
		return repo.save(book);
	}

	@Override
	public Book update(Book book) {
		return repo.save(book);
	}

	@Override
	public void deleteById(Long id) {
		repo.deleteById(id);
	}

}
