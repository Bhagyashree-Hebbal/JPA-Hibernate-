package com.xworkz.librarystore.runner;

import com.xworkz.librarystore.service.LibraryService;
import com.xworkz.librarystore.service.LibraryServiceImpl;

public class MainRunner {

	public static void main(String[] args) {
		LibraryService ref = new LibraryServiceImpl();
		System.out.println(ref.getBookNameById(3));

		System.out.println(ref.getAuthorNameAndPriceById(5));
	}

}
