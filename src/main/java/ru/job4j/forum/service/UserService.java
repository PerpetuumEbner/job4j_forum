package ru.job4j.forum.service;

import ru.job4j.forum.model.User;
import ru.job4j.forum.repository.UserMem;

public class UserService {
    private final UserMem userMem;

    public UserService(UserMem userMem) {
        this.userMem = userMem;
    }

    public void create(User user) {
        userMem.create(user);
    }

    public String findByName(User user) {
        return userMem.findByName(user);
    }
}