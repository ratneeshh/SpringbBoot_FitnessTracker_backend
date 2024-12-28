package com.ratnesh.fitness_tracker.repository;

import com.ratnesh.fitness_tracker.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepo extends JpaRepository<Exercise,Integer> {
}
