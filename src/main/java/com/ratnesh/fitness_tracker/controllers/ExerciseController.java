package com.ratnesh.fitness_tracker.controllers;

import com.ratnesh.fitness_tracker.model.AppUser;
import com.ratnesh.fitness_tracker.model.Exercise;
import com.ratnesh.fitness_tracker.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exercises")
public class ExerciseController {

    @Autowired
    ExerciseService exerciseService;

    @PostMapping
    public ResponseEntity<Exercise> createExercise(@RequestBody Exercise exercise) {
        return ResponseEntity.ok(exerciseService.saveExercise(exercise));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> getUserById(@PathVariable Long id) {
        return exerciseService.getUserById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
    @GetMapping("/all")
    public ResponseEntity<List<Exercise>> getAllExercises(){
        return new ResponseEntity<>(exerciseService.getAllExercises(), HttpStatus.OK);
    }

}
