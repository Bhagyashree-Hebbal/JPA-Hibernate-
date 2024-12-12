package com.xworkz.bookStore.service;

import com.xworkz.bookStore.entity.BookstoreEntity;
import com.xworkz.bookStore.repo.BookstoreRepository;
import com.xworkz.bookStore.repo.BookstoreRepositoryImpl;

public class BookstoreServiceImpl implements BookstoreService {

	@Override
	public boolean save(BookstoreEntity bookstoreEntity) {
		System.out.println("bookstoreEntity:" + bookstoreEntity.toString());
		BookstoreRepository bookstoreRepository = new BookstoreRepositoryImpl();
		bookstoreRepository.save(bookstoreEntity);
		return true;
	}

	@Override
	public String getTitleById(int id) {
		BookstoreRepository bookstoreRepository = new BookstoreRepositoryImpl();
		return bookstoreRepository.getTitleById(id);
	}

	@Override
	public String getTitleByAuthor(String author) {
		BookstoreRepository bookstoreRepository = new BookstoreRepositoryImpl();
		return bookstoreRepository.getTitleByAuthor(author);
	}

	@Override
	public String getTypeByPrice(int price) {
		BookstoreRepository bookstoreRepository = new BookstoreRepositoryImpl();
		return bookstoreRepository.getTypeByPrice(price);
	}

	@Override
	public String getAuthorByBookId(int bookId) {
		BookstoreRepository bookstoreRepository = new BookstoreRepositoryImpl();
		return bookstoreRepository.getAuthorByBookId(bookId);
	}

}
