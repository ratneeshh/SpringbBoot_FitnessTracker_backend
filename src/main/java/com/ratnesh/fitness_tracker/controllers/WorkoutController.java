package com.ratnesh.fitness_tracker.controllers;

import com.ratnesh.fitness_tracker.model.AppUser;
import com.ratnesh.fitness_tracker.model.Workout;
import com.ratnesh.fitness_tracker.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {

    @Autowired
    WorkoutService workoutService;

    @PostMapping
    public ResponseEntity<Workout> createWorkout(@RequestBody Workout workout) {
        return ResponseEntity.ok(workoutService.saveWorkout(workout));

    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getUserById(@PathVariable Long id) {
        return workoutService.getUserById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/all")
    public ResponseEntity<List<Workout>> getAllWorkouts(){
        return new ResponseEntity<>(workoutService.getAllWorkouts(), HttpStatus.OK);
    }

}
