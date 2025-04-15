package com.frontendfuel.v1.mappers;

import java.util.ArrayList;
import java.util.List;

import com.frontendfuel.v1.dto.*;
import com.frontendfuel.v1.entities.*;

public class QuestionMapper {

    public static QuestionDTO toDTO(Question question) {
        return QuestionDTO.builder()
                .id(question.getId())
                .title(question.getTitle())
                .category(question.getCategory())
                .description(question.getDescription())
                .difficulty(question.getDifficulty())
                .tags(question.getTags())
                .starterCode(question.getStarterCode())
                .solutionCode(question.getSolutionCode())
                .author(question.getAuthor())
                .solvedBy(question.getSolvedBy())
                .previewImage(question.getPreviewImage())
                .videoExplanation(question.getVideoExplanation())
                .skillLevel(question.getSkillLevel())
                .estimatedReadingTime(question.getEstimatedReadingTime())
                .isPremium(question.getIsPremium())
                .isFeatured(question.getIsFeatured())
                .duration(question.getDuration())
                .likes(question.getLikes())
                .createdAt(question.getCreatedAt())
                .solved(question.getSolved())
                .solvedOn(question.getSolvedOn())
                .updatedAt(question.getUpdatedAt())
                .build();
            }
            
            public static Question toEntity(QuestionDTO dto) {
                return Question.builder()
                .id(dto.getId())
                .title(dto.getTitle())
                .category(dto.getCategory())
                .description(dto.getDescription())
                .difficulty(dto.getDifficulty().toLowerCase())
                .tags(dto.getTags())
                .starterCode(dto.getStarterCode())
                .solutionCode(dto.getSolutionCode())
                .author(dto.getAuthor())
                .solvedBy(dto.getSolvedBy())
                .previewImage(dto.getPreviewImage())
                .videoExplanation(dto.getVideoExplanation())
                .skillLevel(dto.getSkillLevel())
                .estimatedReadingTime(dto.getEstimatedReadingTime())
                .isPremium(dto.getIsPremium())
                .isFeatured(dto.getIsFeatured())
                .duration(dto.getDuration())
                .likes(dto.getLikes())
                .solved(dto.getSolved())
                .solvedOn(dto.getSolvedOn())
                .createdAt(dto.getCreatedAt())
                .updatedAt(dto.getUpdatedAt())
                .build();
    }
}
