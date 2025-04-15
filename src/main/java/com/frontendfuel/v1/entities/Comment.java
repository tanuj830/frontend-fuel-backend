package com.frontendfuel.v1.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(columnDefinition = "TEXT")
    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;  // Reference to User

    @ManyToOne
    @JoinColumn(name = "question_id", nullable = false)
    private Question question;  // Reference to Question
}
