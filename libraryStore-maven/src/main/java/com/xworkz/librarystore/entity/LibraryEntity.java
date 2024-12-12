package com.xworkz.librarystore.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "libraryStore_table")
@NamedQuery(name="getBookNameById",query="select le.bookName from LibraryEntity le where le.id= :id")
@NamedQuery(name="getAuthorNameAndPriceById",query="select le.authorName ,le.price from LibraryEntity le where le.id= :id")
public class LibraryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "book_name")
	private String bookName;
	@Column(name = "author_name")
	private String authorName;
	@Column(name = "publication_year")
	private LocalDate publicationYear;
	private double price;
	
	public LibraryEntity() {
		// TODO Auto-generated constructor stub
	}

	public LibraryEntity(String bookName, String authorName, LocalDate publicationYear, double price) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.publicationYear = publicationYear;
		this.price = price;
	}

	@Override
	public String toString() {
		return "LibraryEntity [id=" + id + ", bookName=" + bookName + ", authorName=" + authorName
				+ ", publicationYear=" + publicationYear + ", price=" + price + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public LocalDate getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(LocalDate publicationYear) {
		this.publicationYear = publicationYear;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
