package com.api.book.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.api.book.entities.Book;

@Component
public class BookServices {
	private static List<Book> books = new ArrayList<>();
	
	static {
		books.add(new Book(1, "sdfs", "sdfsdfa"));
		books.add(new Book(2, "sdfs", "sdfsdfa"));
		books.add(new Book(3, "sdfs", "sdfsdfa"));
	}
	
	public List<Book> getAllBooks() {
		return books;
	}
	
	public Book getBookById(int id) {
		Book book = null;
		try {
			book = books.stream().filter(e->e.getId() == id).findFirst().get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}
	
	public static Book addBook(Book book) {
		books.add(new Book(book.getId(), book.getTitle(), book.getAuthor()));
		return book;
	}
}
