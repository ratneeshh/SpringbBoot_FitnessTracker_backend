package com.ratnesh.fitness_tracker.service;

import com.ratnesh.fitness_tracker.model.AppUser;
import com.ratnesh.fitness_tracker.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public List<AppUser> getAllAppUsers() {
        return userRepo.findAll();
    }

    public AppUser saveUser(AppUser appUser) {
        return userRepo.save(appUser);
    }

    public Optional<AppUser> getUserById(Long id) {
        return userRepo.findById(Math.toIntExact(id));
    }
}
