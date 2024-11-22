package com.xworkz.speaker.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SpeakerRunner {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		if (emf != null) {
			System.out.println("This is connected");
		} else {
			System.out.println("This is not connected");
		}

	}

}
