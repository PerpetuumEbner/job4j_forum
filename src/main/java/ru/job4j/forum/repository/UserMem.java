package ru.job4j.forum.repository;

import ru.job4j.forum.model.User;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class UserMem {
    private final Map<Integer, User> users = new ConcurrentHashMap<>();

    private final AtomicInteger ID = new AtomicInteger(2);

    public UserMem() {
        users.put(1, new User(1, "admin", "password"));
        users.put(2, new User(2, "user", "password"));
    }

    public void create(User user) {
        user.setId(ID.incrementAndGet());
        users.put(user.getId(), user);
    }

    public String findByName(User user) {
        return users.get(user).getName();
    }
}