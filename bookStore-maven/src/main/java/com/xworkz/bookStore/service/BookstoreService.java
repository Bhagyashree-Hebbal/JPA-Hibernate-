package com.xworkz.bookStore.service;

import com.xworkz.bookStore.entity.BookstoreEntity;

public interface BookstoreService {

	boolean save(BookstoreEntity bookstoreEntity);

	String getTitleById(int id);

	String getTitleByAuthor(String author);

	String getTypeByPrice(int price);

	String getAuthorAndType(String type);
}
