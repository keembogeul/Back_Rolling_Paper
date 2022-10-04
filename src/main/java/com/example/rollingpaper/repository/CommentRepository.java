package com.example.rollingpaper.repository;

import com.example.rollingpaper.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
