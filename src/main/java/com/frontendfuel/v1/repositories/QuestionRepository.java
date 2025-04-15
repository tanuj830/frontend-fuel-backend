package com.frontendfuel.v1.repositories;
import com.frontendfuel.v1.entities.Question;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuestionRepository extends MongoRepository<Question, String> {
}
