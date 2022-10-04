package com.example.rollingpaper.controller;

import com.example.rollingpaper.dto.CommentRequestDto;
import com.example.rollingpaper.dto.ResponseDto;
import com.example.rollingpaper.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    @PostMapping("/comments")
    public ResponseDto<?> commentCreate(@RequestBody CommentRequestDto requestDto){
        return commentService.createComment(requestDto);
    }
}
