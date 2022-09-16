package ru.job4j.forum.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.job4j.forum.model.Post;
import ru.job4j.forum.service.PostService;

import java.time.LocalDate;

@Controller
public class PostControl {
    private final PostService postService;

    public PostControl(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/create")
    public String create() {
        return "post/create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Post post) {
        post.setCreated(LocalDate.now());
        postService.create(post);
        return "redirect:/";
    }

    @GetMapping("/post")
    public String postDetail(Model model, @RequestParam("id") int id) {
        model.addAttribute("post", postService.findById(id));
        return "post/post";
    }

    @GetMapping("/edit")
    public String edit(Model model, @RequestParam("id") int id) {
        model.addAttribute("post", postService.findById(id));
        return "post/edit";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Post post) {
        postService.update(post);
        return "redirect:/";
    }
}