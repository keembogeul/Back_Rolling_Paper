package com.example.rollingpaper.repository;

import com.example.rollingpaper.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findALlByRollingPaperId(Long rollingPaperId);
}
