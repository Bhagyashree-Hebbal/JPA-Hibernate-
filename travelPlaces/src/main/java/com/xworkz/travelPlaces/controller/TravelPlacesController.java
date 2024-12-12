package com.xworkz.travelPlaces.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.travelPlaces.dto.TravelPlacesDTO;
import com.xworkz.travelPlaces.service.TravelPlacesService;
import com.xworkz.travelPlaces.service.TravelPlacesServiceImpl;

@Controller
@RequestMapping("/")
public class TravelPlacesController {

	public TravelPlacesController() {

	}

	@GetMapping("/save")
	public String onSave() {
		System.out.println("This is get");
		return "index.jsp";
	}

	@PostMapping("/save")
	public String onSave(TravelPlacesDTO dto) {
		System.out.println(dto.toString());
		TravelPlacesService placesService = new TravelPlacesServiceImpl();
		boolean saved = placesService.save(dto);
		return "index.jsp";
	}
}
