package com.example.rollingpaper.repository;

import com.example.rollingpaper.model.RollingPaper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RollingPaperRepository extends JpaRepository<RollingPaper, Long> {
    List<RollingPaper> findAll();
}
