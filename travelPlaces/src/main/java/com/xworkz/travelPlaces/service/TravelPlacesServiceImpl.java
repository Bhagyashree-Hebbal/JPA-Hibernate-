package com.xworkz.travelPlaces.service;

import org.springframework.stereotype.Service;

import com.xworkz.travelPlaces.dto.TravelPlacesDTO;
import com.xworkz.travelPlaces.entity.TravelPlacesEntity;
import com.xworkz.travelPlaces.repository.TravelPlacesRepository;
import com.xworkz.travelPlaces.repository.TravelPlacesRepositoryImpl;

@Service
public class TravelPlacesServiceImpl implements TravelPlacesService {

	@Override
	public boolean save(TravelPlacesDTO dto) {
		System.out.println("dto in service==" + dto.toString());

		TravelPlacesEntity entity = new TravelPlacesEntity();
		entity.setPlaceName(dto.getPlaceName());
		entity.setPinCode(dto.getPinCode());

		TravelPlacesRepository placesRepository = new TravelPlacesRepositoryImpl();
		placesRepository.save(entity);
		System.out.println("entity==" + entity.toString());
		return false;
	}

}
