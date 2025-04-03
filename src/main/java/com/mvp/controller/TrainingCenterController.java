package com.mvp.controller;

import com.mvp.model.TrainingCenter;
import com.mvp.service.TrainingCenterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/training-centers")
public class TrainingCenterController {

	@Autowired
	private TrainingCenterService trainingCenterService;

	// Create a new Training Center (POST API)
	@PostMapping
	public ResponseEntity<TrainingCenter> createTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter) {
		TrainingCenter savedCenter = trainingCenterService.createTrainingCenter(trainingCenter);
		return ResponseEntity.ok(savedCenter);
	}

	// Get all Training Centers (GET API)
	@GetMapping
	public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
		List<TrainingCenter> centers = trainingCenterService.getAllTrainingCenters();
		return ResponseEntity.ok(centers);
	}
}
