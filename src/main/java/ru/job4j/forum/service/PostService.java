package ru.job4j.forum.service;

import org.springframework.stereotype.Service;
import ru.job4j.forum.model.Post;
import ru.job4j.forum.repository.PostRepository;

import java.util.Collection;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void create(Post post) {
        postRepository.save(post);
    }

    public Post findById(int id) {
        return postRepository.findById(id).orElse(null);
    }

    public Collection<Post> getAll() {
        return (Collection<Post>) postRepository.findAll();
    }

    public void update(Post post) {
        postRepository.save(post);
    }
}