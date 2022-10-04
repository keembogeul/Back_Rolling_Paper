package com.example.rollingpaper.controller;

import com.example.rollingpaper.dto.ResponseDto;
import com.example.rollingpaper.dto.RollingPaperRequestDto;
import com.example.rollingpaper.service.RollingPaperService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class RollingPaperController {
    private final RollingPaperService rollingPaperService;

    @PostMapping("/rolling-paper")
    public ResponseDto<?> rollingPaperCreate(@RequestBody RollingPaperRequestDto requestDto) throws IOException {
        return rollingPaperService.createRollingPaper(requestDto);
    }

    @GetMapping("/rolling-paper")
    public ResponseDto<?> getRollingPaper() {
        return rollingPaperService.getAllRollingPaper();
    }

}
