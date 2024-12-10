package com.xworkz.bookStore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "bookstore_table")
@NamedQuery(name = "getTitleById", query = "select be.title from BookstoreEntity be where be.id= :id")
@NamedQuery(name = "getTitleByAuthor", query = "select be.title from BookstoreEntity be where be.author= :author")
@NamedQuery(name = "getTypeByPrice", query = "select be.type from BookstoreEntity be where be.price = :price")
@NamedQuery(name = "getAuthor&Type", query = "select be.author from BookstoreEntity be where be.id= :id and be.type= :type")
public class BookstoreEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "book_id")
	private int bookId;
	private String title;
	private String author;
	private String type;
	private double price;

	public BookstoreEntity(int bookId, String title, String author, String type, double price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.type = type;
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookstoreEntity [id=" + id + ", bookId=" + bookId + ", title=" + title + ", author=" + author
				+ ", type=" + type + ", price=" + price + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
