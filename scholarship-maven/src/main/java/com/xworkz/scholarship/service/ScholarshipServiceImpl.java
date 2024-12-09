package com.xworkz.scholarship.service;

import com.xworkz.scholarship.entity.ScholarshipEntity;
import com.xworkz.scholarship.repository.ScholarshipRepository;
import com.xworkz.scholarship.repository.ScholarshipRepositoryImpl;

public class ScholarshipServiceImpl implements ScholarshipService {

	@Override
	public boolean save(ScholarshipEntity scholarshipEntity) {
		System.out.println("ScholarshipEntity:" + scholarshipEntity.toString());
		ScholarshipRepository scholarshipRepository = new ScholarshipRepositoryImpl();
		scholarshipRepository.save(scholarshipEntity);
		return true;
	}

}
