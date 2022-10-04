package com.example.rollingpaper.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RollingPaperRequestDto {
    private String name;
    private String content;
    private String left;
    private String top;
    private String color;
}
