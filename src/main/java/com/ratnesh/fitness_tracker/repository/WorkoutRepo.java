package com.ratnesh.fitness_tracker.repository;

import com.ratnesh.fitness_tracker.model.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRepo extends JpaRepository<Workout,Integer> {
}
