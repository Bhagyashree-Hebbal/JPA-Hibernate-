package com.xworkz.librarystore.service;

import java.util.List;

import com.xworkz.librarystore.entity.LibraryEntity;

public interface LibraryService {

	List<LibraryEntity> getBookNameById(int id);

	List<Object[]> getAuthorNameAndPriceById(int id);
}
