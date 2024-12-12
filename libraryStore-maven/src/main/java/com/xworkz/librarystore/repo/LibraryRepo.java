package com.xworkz.librarystore.repo;

import java.util.List;

import com.xworkz.librarystore.entity.LibraryEntity;

public interface LibraryRepo {

	List<LibraryEntity> getBookNameById(int id);

	List<Object[]> getAuthorNameAndPriceById(int id);

}
