package com.frontendfuel.v1.repositories;
import com.frontendfuel.v1.entities.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepository extends MongoRepository<Comment, String> {
}
