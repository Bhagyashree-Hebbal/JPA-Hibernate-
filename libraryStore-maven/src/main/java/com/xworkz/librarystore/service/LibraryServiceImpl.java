package com.xworkz.librarystore.service;

import java.util.List;

import com.xworkz.librarystore.entity.LibraryEntity;
import com.xworkz.librarystore.repo.LibraryRepo;
import com.xworkz.librarystore.repo.LibraryRepoImpl;

public class LibraryServiceImpl implements LibraryService {

	@Override
	public List<LibraryEntity> getBookNameById(int id) {
		LibraryRepo libraryRepo = new LibraryRepoImpl();
		List<LibraryEntity> list = libraryRepo.getBookNameById(id);
		return list;
	}

	@Override
	public List<Object[]> getAuthorNameAndPriceById(int id) {
		LibraryRepo libraryRepo = new LibraryRepoImpl();
		List<Object[]> list = libraryRepo.getAuthorNameAndPriceById(id);
		return list;
	}

}
