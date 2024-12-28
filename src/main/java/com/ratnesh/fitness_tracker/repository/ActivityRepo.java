package com.ratnesh.fitness_tracker.repository;

import com.ratnesh.fitness_tracker.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepo extends JpaRepository<Activity,Integer> {
}
