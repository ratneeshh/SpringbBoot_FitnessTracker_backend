package com.ratnesh.fitness_tracker.service;

import com.ratnesh.fitness_tracker.model.AppUser;
import com.ratnesh.fitness_tracker.model.Exercise;
import com.ratnesh.fitness_tracker.model.Workout;
import com.ratnesh.fitness_tracker.repository.ExerciseRepo;
import com.ratnesh.fitness_tracker.repository.WorkoutRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExerciseService {

    @Autowired
    ExerciseRepo exerciseRepo;
    @Autowired
    WorkoutRepo workoutRepo;

    @Transactional
    public Exercise saveExercise(Exercise exercise) {
        if (exercise.getWorkout() != null) {
            Workout workout = workoutRepo.findById(exercise.getWorkout().getId())
                    .orElseThrow(() -> new RuntimeException("Workout not found"));
            exercise.setWorkout(workout);
        }
        return exerciseRepo.save(exercise);
    }


    public Optional<Object> getUserById(Long id) {
        return Optional.of(exerciseRepo.findById(Math.toIntExact(id)));
    }

    public List<Exercise> getAllExercises() {
       return exerciseRepo.findAll();
    }
}
