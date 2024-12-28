package com.ratnesh.fitness_tracker.service;

import com.ratnesh.fitness_tracker.model.Workout;
import com.ratnesh.fitness_tracker.repository.WorkoutRepo;
import jakarta.transaction.Transactional;
import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkoutService {

    @Autowired
    WorkoutRepo workoutRepo;


    @Transactional
    public Workout saveWorkout(Workout workout) {
        workout.getExercises().forEach(exercise -> exercise.setWorkout(workout));
        return workoutRepo.save(workout);
    }


    public Optional<Object> getUserById(Long id) {
        return Optional.of(workoutRepo.findById(Math.toIntExact(id)));
    }

    public List<Workout> getAllWorkouts() {
        return workoutRepo.findAll();
    }
}
