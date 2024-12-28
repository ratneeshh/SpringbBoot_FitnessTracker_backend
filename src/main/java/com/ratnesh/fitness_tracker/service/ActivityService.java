package com.ratnesh.fitness_tracker.service;

import com.ratnesh.fitness_tracker.model.Activity;
import com.ratnesh.fitness_tracker.model.AppUser;
import com.ratnesh.fitness_tracker.repository.ActivityRepo;
import com.ratnesh.fitness_tracker.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActivityService {

    @Autowired
    ActivityRepo activityRepo;

    public Activity saveActivity(Activity activity) {
        return activityRepo.save(activity);
    }

    public Optional<Object> getUserById(Long id) {
        return Optional.of(activityRepo.findById(Math.toIntExact(id)));
    }

    public List<Activity> getAllActivities() {
        return activityRepo.findAll();
    }
}

