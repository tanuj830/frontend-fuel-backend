package com.frontendfuel.v1.repositories;

import com.frontendfuel.v1.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, String> {
}
