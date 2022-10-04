package com.example.rollingpaper.service;

import com.example.rollingpaper.dto.ResponseDto;
import com.example.rollingpaper.dto.RollingPaperRequestDto;
import com.example.rollingpaper.dto.RollingPaperResponseDto;
import com.example.rollingpaper.model.RollingPaper;
import com.example.rollingpaper.repository.RollingPaperRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RollingPaperService {
    private final RollingPaperRepository rollingPaperRepository;

    @Transactional
    public ResponseDto<?> createRollingPaper(RollingPaperRequestDto requestDto) {
        RollingPaper rollingPaper = RollingPaper.builder()
                .name(requestDto.getName())
                .content(requestDto.getContent())
                .build();
        rollingPaperRepository.save(rollingPaper);

        return ResponseDto.success(new RollingPaperResponseDto(rollingPaper));
    }

    @Transactional
    public ResponseDto<?> getAllRollingPaper() {
        List<RollingPaper> rollingPaperList = rollingPaperRepository.findAll();
        List<RollingPaperResponseDto> rollingPaperResponseDtoList = new ArrayList<>();

        for (RollingPaper rollingPaper : rollingPaperList) {
            rollingPaperResponseDtoList.add(new RollingPaperResponseDto(rollingPaper));
        }

        return ResponseDto.success(rollingPaperResponseDtoList);
    }
}
