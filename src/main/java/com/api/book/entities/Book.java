package com.api.book.entities;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;


@Entity
@Table(name = "book")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String title;
	
//	@OneToOne(cascade = CascadeType.ALL)
	private String author;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book(int id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
