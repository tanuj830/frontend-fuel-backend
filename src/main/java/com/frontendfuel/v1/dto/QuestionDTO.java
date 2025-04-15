package com.frontendfuel.v1.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import com.frontendfuel.v1.entities.Tag;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QuestionDTO {
    private String id;
    private String title;
    private String category;
    private String description;
    private String difficulty;

    private List<Tag> tags;
    private String starterCode;
    private String solutionCode;
    private String author;
    private int solvedBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private int duration;
    private String previewImage;
    private String videoExplanation;
    private String skillLevel;
    private int estimatedReadingTime;
    private Boolean solved;
    private LocalDateTime solvedOn;
    private Boolean isPremium;
    private Boolean isFeatured;
    private int likes;
}