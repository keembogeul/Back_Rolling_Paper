package com.example.rollingpaper.model;

import com.example.rollingpaper.dto.ChangeLocationDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class RollingPaper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String content;

    @Column(name = "left_location", nullable = false)
    private String left;

    @Column(name = "right_location", nullable = false)
    private String top;

    public void changeLocation(ChangeLocationDto changeLocationDto) {
        this.left = changeLocationDto.getLeft();
        this.top = changeLocationDto.getTop();
    }

}
