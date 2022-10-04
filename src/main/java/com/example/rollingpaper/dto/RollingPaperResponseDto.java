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
    private String left;
    private String top;
    private String color;

    public RollingPaperResponseDto(RollingPaper rollingPaper) {
        this.id = rollingPaper.getId();
        this.name = rollingPaper.getName();
        this.content = rollingPaper.getContent();
        this.left = rollingPaper.getLeft();
        this.top = rollingPaper.getTop();
        this.color = rollingPaper.getColor();
    }
}
