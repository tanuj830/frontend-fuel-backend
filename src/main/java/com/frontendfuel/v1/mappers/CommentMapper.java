package com.frontendfuel.v1.mappers;

import com.frontendfuel.v1.dto.CommentDTO;
import com.frontendfuel.v1.entities.Comment;
import com.frontendfuel.v1.entities.Question;
import com.frontendfuel.v1.entities.User;

public class CommentMapper {
    public static CommentDTO toDTO(Comment comment) {
        return CommentDTO.builder()
                .id(comment.getId())
                .content(comment.getContent())
                .userId(comment.getUser().getId())
                .questionId(comment.getQuestion().getId())
                .build();
    }
    public static Comment toEntity(CommentDTO commentDTO, User user, Question question) {
        return Comment.builder()
                .id(commentDTO.getId())
                .content(commentDTO.getContent())
                .user(user)
                .question(question)
                .build();
    }
    
}