package com.xworkz.scholarship.runner;

import java.time.LocalDate;

import com.xworkz.scholarship.entity.ScholarshipEntity;
import com.xworkz.scholarship.service.ScholarshipService;
import com.xworkz.scholarship.service.ScholarshipServiceImpl;

public class MainRunner {

	public static void main(String[] args) {
		ScholarshipEntity scholarshipEntity = new ScholarshipEntity("Arjun", "arjunsharma@gmail.com", 9874563235L, 24,
				"Computer Science", LocalDate.of(2024, 1, 10), LocalDate.now(), true, 35000, "Approved");
		
		ScholarshipService scholarshipService = new ScholarshipServiceImpl();
		scholarshipService.save(scholarshipEntity);
	}

}
