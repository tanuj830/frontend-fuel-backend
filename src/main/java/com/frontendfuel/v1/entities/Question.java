package com.frontendfuel.v1.entities;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import jakarta.persistence.*;
import lombok.*;


@Table(name="question")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String title;
    private String category;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String difficulty;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinTable(
        name = "question_tags",
        joinColumns = @JoinColumn(name = "question_id"),
        inverseJoinColumns = @JoinColumn(name = "tag_id")
    )    private List<Tag> tags;

    @Column(columnDefinition = "TEXT")
    private String starterCode;

    @Column(columnDefinition = "TEXT")
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

    @Column(updatable = false)
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    // Many-to-many relationship with User (tracking users who solved the question)
    @ManyToMany
    @JoinTable(
        name = "user_solved_questions",
        joinColumns = @JoinColumn(name = "question_id"),
        inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> solvedByUsers;
}
