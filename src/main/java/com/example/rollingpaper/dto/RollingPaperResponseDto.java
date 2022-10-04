package com.example.rollingpaper.dto;

import com.example.rollingpaper.model.RollingPaper;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RollingPaperResponseDto {
    private Long id;
    private String name;
    private String content;

    public RollingPaperResponseDto(RollingPaper rollingPaper) {
        this.id = rollingPaper.getId();
        this.name = rollingPaper.getName();
        this.content = rollingPaper.getContent();
    }
}
