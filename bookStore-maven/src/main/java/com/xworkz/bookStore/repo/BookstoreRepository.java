package com.xworkz.bookStore.repo;

import com.xworkz.bookStore.entity.BookstoreEntity;

public interface BookstoreRepository {

	boolean save(BookstoreEntity bookstoreEntity);

	String getTitleById(int id);

	String getTitleByAuthor(String author);

	String getTypeByPrice(int price);

	String getAuthorByBookId(int bookId);

}
