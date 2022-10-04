package com.example.rollingpaper.dto;

import com.example.rollingpaper.model.Comment;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CommentResponseDto {
    private Long commentId;
    private String nickname;
    private String comment;

    public CommentResponseDto(Comment comment){
        this.commentId = comment.getId();
        this.nickname = comment.getNickname();
        this.comment = comment.getComment();
    }
}
