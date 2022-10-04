package com.example.rollingpaper.service;

import com.example.rollingpaper.dto.CommentRequestDto;
import com.example.rollingpaper.dto.CommentResponseDto;
import com.example.rollingpaper.dto.ResponseDto;
import com.example.rollingpaper.model.Comment;
import com.example.rollingpaper.model.RollingPaper;
import com.example.rollingpaper.repository.CommentRepository;
import com.example.rollingpaper.repository.RollingPaperRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final RollingPaperRepository rollingPaperRepository;
    private final CommentRepository commentRepository;


    @Transactional
    public ResponseDto<?> createComment(CommentRequestDto requestDto){
        Optional<RollingPaper> rollingPaper = rollingPaperRepository.findById(requestDto.getRollingPaperId());
        if(!rollingPaper.isPresent()){
            throw new IllegalArgumentException("존재하지 않는 롤링페이퍼입니다.");
        }
        Comment comment = Comment.builder()
                .nickname(requestDto.getNickname())
                .comment(requestDto.getComment())
                .rollingpaper(rollingPaper.get())
                .build();
        commentRepository.save(comment);
        return ResponseDto.success(new CommentResponseDto(comment));
    }
}
