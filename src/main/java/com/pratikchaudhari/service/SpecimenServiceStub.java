package com.pratikchaudhari.service;

import org.springframework.stereotype.Component;

import com.pratikchaudhari.dto.SpecimenDTO;

@Component
public class SpecimenServiceStub implements ISpecimenService {
	
	@Override
	public SpecimenDTO fetchById(int id) {
		SpecimenDTO specimenDTO = new SpecimenDTO();
		specimenDTO.setSpecimenId(36);
		specimenDTO.setLatitude("39.74");
		specimenDTO.setLongitude("-81.54");
		specimenDTO.setDescription (" A wonderful Eastern Redbud");
		return specimenDTO;
	}
	
	@Override
	public void save(SpecimenDTO specimenDTO) {
		
	}

}
