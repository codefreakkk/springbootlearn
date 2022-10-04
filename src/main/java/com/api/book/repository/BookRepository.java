package com.api.book.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.book.entities.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
	public Book getBookById(int id);
}
