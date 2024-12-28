package com.ratnesh.fitness_tracker.controllers;

import com.ratnesh.fitness_tracker.model.Activity;
import com.ratnesh.fitness_tracker.model.AppUser;
import com.ratnesh.fitness_tracker.model.Exercise;
import com.ratnesh.fitness_tracker.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/activities")
public class ActivityController {

    @Autowired
    ActivityService activityService;

    @PostMapping
    public ResponseEntity<Activity> createActivity(@RequestBody Activity activity) {
        return ResponseEntity.ok(activityService.saveActivity(activity));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> getUserById(@PathVariable Long id) {
        return activityService.getUserById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
    @GetMapping("/all")
    public ResponseEntity<List<Activity>> getAllActivities(){
        return new ResponseEntity<>(activityService.getAllActivities(), HttpStatus.OK);
    }

}
