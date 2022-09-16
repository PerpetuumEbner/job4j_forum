package ru.job4j.forum.service;

import org.springframework.stereotype.Service;
import ru.job4j.forum.model.Post;
import ru.job4j.forum.repository.PostMem;

import java.util.Collection;

@Service
public class PostService {
    private final PostMem postMem;

    public PostService(PostMem postMem) {
        this.postMem = postMem;
    }

    public void create(Post post) {
        postMem.create(post);
    }

    public Post findById(int id) {
        return postMem.findById(id);
    }

    public Collection<Post> getAll() {
        return postMem.getAll();
    }

    public void update(Post post) {
        postMem.update(post);
    }
}