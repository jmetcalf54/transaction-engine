package com.metcalf.transaction_engine;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public User create(@RequestBody CreateUserRequest request) {
        User user = new User(request.email());
        return repository.save(user);
    }

    @GetMapping
    public List<User> all() {
        return repository.findAll();
    }

}

record CreateUserRequest(String email) {}