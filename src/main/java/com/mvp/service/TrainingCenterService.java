package com.mvp.service;

import com.mvp.model.TrainingCenter;
import com.mvp.repository.TrainingCenterRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingCenterService {

	@Autowired
	private TrainingCenterRepository trainingCenterRepository;

	// Method to save a new Training Center
	public TrainingCenter createTrainingCenter(@Valid TrainingCenter trainingCenter) {
		return trainingCenterRepository.save(trainingCenter);
	}

	// Method to get all Training Centers
	public List<TrainingCenter> getAllTrainingCenters() {
		return trainingCenterRepository.findAll();
	}
}
