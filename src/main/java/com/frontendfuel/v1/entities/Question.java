package com.frontendfuel.v1.entities;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "questions")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Question {

    @Id
    private String id;

    private String title;
    private String category;
    private String description;
    private String difficulty;

    @DBRef
    private List<Tag> tags;

    private String starterCode;
    private String solutionCode;
    private String author;
    private Integer solvedBy;
    private String previewImage;
    private String videoExplanation;
    private String skillLevel;
    private Integer estimatedReadingTime;
    private Boolean isPremium;
    private Boolean isFeatured;
    private Integer duration;
    private Integer likes;
    private Boolean solved;
    private LocalDateTime solvedOn;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @DBRef
    private List<User> solvedByUsers;
}
