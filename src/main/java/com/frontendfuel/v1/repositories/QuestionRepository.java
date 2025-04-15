package com.frontendfuel.v1.repositories;

import com.frontendfuel.v1.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, String> {
}
