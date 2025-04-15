package com.frontendfuel.v1.services;


import com.frontendfuel.v1.dto.QuestionDTO;
import com.frontendfuel.v1.entities.Question;
import com.frontendfuel.v1.repositories.QuestionRepository;
import com.frontendfuel.v1.mappers.QuestionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QuestionService {

    private final QuestionRepository questionRepository;

    public List<QuestionDTO> getAllQuestions() {
        return questionRepository.findAll()
                .stream()
                .map(QuestionMapper::toDTO)
                .collect(Collectors.toList());
    }

    public QuestionDTO getQuestionById(String id) {
        Question question = questionRepository.findById(id).orElseThrow();
        return QuestionMapper.toDTO(question);
    }

    public QuestionDTO createQuestion(QuestionDTO questionDTO) {
        Question question = QuestionMapper.toEntity(questionDTO);
        return QuestionMapper.toDTO(questionRepository.save(question));
    }

    public void deleteQuestion(String id) {
        questionRepository.deleteById(id);
    }
}