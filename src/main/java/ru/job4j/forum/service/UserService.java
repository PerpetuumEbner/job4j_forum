package ru.job4j.forum.service;

import ru.job4j.forum.model.User;
import ru.job4j.forum.repository.UserRepository;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void create(User user) {
        userRepository.save(user);
    }

    public User findByName(String username) {
        return userRepository.findByName(username);
    }
}