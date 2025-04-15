package com.frontendfuel.v1.services;

import com.frontendfuel.v1.dto.CommentDTO;
import com.frontendfuel.v1.entities.Comment;
import com.frontendfuel.v1.entities.Question;
import com.frontendfuel.v1.entities.User;
import com.frontendfuel.v1.repositories.CommentRepository;
import com.frontendfuel.v1.repositories.QuestionRepository;
import com.frontendfuel.v1.repositories.UserRepository;
import com.frontendfuel.v1.mappers.CommentMapper;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CommentService {

    @Autowired
    private final CommentRepository commentRepository;
    @Autowired
    private final UserRepository userRepository;
    @Autowired
    private final QuestionRepository questionRepository;

    public List<CommentDTO> getAllComments() {
        return commentRepository.findAll()
                .stream()
                .map(CommentMapper::toDTO)
                .collect(Collectors.toList());
    }

    public CommentDTO getCommentById(String id) {
        Comment comment = commentRepository.findById(id).orElseThrow();
        return CommentMapper.toDTO(comment);
    }

    public CommentDTO createComment(CommentDTO commentDTO) {
        User user = userRepository.findById(commentDTO.getUserId())
            .orElseThrow(() -> new RuntimeException("User not found"));

        Question question = questionRepository.findById(commentDTO.getQuestionId())
            .orElseThrow(() -> new RuntimeException("Question not found"));

        Comment comment = CommentMapper.toEntity(commentDTO, user, question);
        return CommentMapper.toDTO(commentRepository.save(comment));
    }

    public void deleteComment(String id) {
        commentRepository.deleteById(id);
    }
}
