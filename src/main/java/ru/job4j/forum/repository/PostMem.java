package ru.job4j.forum.repository;

import org.springframework.stereotype.Repository;
import ru.job4j.forum.model.Post;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class PostMem {
    private final Map<Integer, Post> posts = new ConcurrentHashMap<>();

    private final AtomicInteger ID = new AtomicInteger(3);

    public PostMem() {
        posts.put(1, new Post(1, "Продаю машину ладу 01.", "description", LocalDate.of(2022, 9, 5)));
        posts.put(2, new Post(2, "Вывоз мусора", "description", LocalDate.of(2022, 9, 10)));
        posts.put(3, new Post(3, "Отдам котям в хорошие руки", "description", LocalDate.of(2022, 9, 15)));
    }

    public void create(Post post) {
        post.setId(ID.incrementAndGet());
        posts.put(post.getId(), post);
    }

    public Post findById(int id) {
        return posts.get(id);
    }

    public Collection<Post> getAll() {
        return posts.values();
    }

    public void update(Post post) {
        posts.replace(post.getId(), post);
    }
}