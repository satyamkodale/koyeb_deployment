package com.h2db.H2DBExample.Controllers;

import com.h2db.H2DBExample.Entities.User;
import com.h2db.H2DBExample.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
    private UserRepo userRepository;

    @GetMapping
    public List<User> getAllUsers() {
	
        return userRepository.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
 
        return userRepository.save(user);
    }
}