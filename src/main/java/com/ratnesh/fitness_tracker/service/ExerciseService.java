package com.ratnesh.fitness_tracker.service;

import com.ratnesh.fitness_tracker.model.AppUser;
import com.ratnesh.fitness_tracker.model.Exercise;
import com.ratnesh.fitness_tracker.repository.ExerciseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExerciseService {

    @Autowired
    ExerciseRepo exerciseRepo;

    public Exercise saveExercise(Exercise exercise) {
        return exerciseRepo.save(exercise);
    }

    public Optional<Object> getUserById(Long id) {
        return Optional.of(exerciseRepo.findById(Math.toIntExact(id)));
    }

    public List<Exercise> getAllExercises() {
       return exerciseRepo.findAll();
    }
}
