package com.frontendfuel.v1.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String username;
    private String email;

    // Many-to-many relationship with Question (tracking questions solved by the user)
    @ManyToMany(mappedBy = "solvedByUsers")
    private List<Question> solvedQuestions;
}
