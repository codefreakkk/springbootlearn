package com.api.book.controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.entities.Book;
import com.api.book.repository.BookRepository;
import com.api.book.services.BookServices;

@RestController
public class BookController {
	
	@Autowired
	private BookServices bookServices;
	
	@Autowired
	private BookRepository bookRepository;
	
//	@RequestMapping(value = "/books", method = RequestMethod.GET)
//	@ResponseBody
//	public String getBooks() {
//		return "this is book ag basi";
//	}
	
	@GetMapping("/books")
	public List<Book> getBooks() {
//		Book book = new Book(1, "fuck", "harsh");
//		return book;
//		List<Book> books = bookServices.getAllBooks();
		List<Book> books = (List<Book>) this.bookRepository.findAll();
		return books;
	}
	
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getBook(@PathVariable("id") int id) {
		try {
//			Book book = this.bookServices.getBookById(id);
			Book book = this.bookRepository.getBookById(id);
			return ResponseEntity.status(HttpStatus.CREATED).body(book);
//			return ResponseEntity.ok().body(book);
		} catch (Exception e) {
			System.out.println("innn bhava");
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
		return this.bookRepository.save(book);
	}
	
	@PutMapping("/books/{id}")
	public Book updateBook(@RequestBody Book book, @PathVariable("id") int id) {
		return book;
	}
}

















