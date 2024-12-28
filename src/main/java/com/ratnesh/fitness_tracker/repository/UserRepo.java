package com.ratnesh.fitness_tracker.repository;

import com.ratnesh.fitness_tracker.model.AppUser;
import com.ratnesh.fitness_tracker.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<AppUser,Integer> {
}
