package ru.job4j.forum.model;

import lombok.*;

import java.time.LocalDate;
import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter
public class Post {
    private int id;

    private String name;

    private String description;

    private LocalDate created;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Post post = (Post) o;
        return id == post.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}