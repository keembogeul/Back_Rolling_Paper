package com.example.rollingpaper.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CommentRequestDto {
    private Long rollingPaperId;
    private String nickname;
    private String comment;

}
