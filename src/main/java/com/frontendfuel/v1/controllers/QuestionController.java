package com.frontendfuel.v1.controllers;

import com.frontendfuel.v1.dto.*;
import com.frontendfuel.v1.services.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
@CrossOrigin
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionService questionService;

    @PostMapping
    public ResponseEntity<QuestionDTO> create(@RequestBody QuestionDTO dto) {
        return ResponseEntity.ok(questionService.createQuestion(dto));
    }

    @GetMapping
    public ResponseEntity<List<QuestionDTO>> getAll() {
        return ResponseEntity.ok(questionService.getAllQuestions());
    }

    @GetMapping("/{id}")
    public ResponseEntity<QuestionDTO> getById(@PathVariable String id) {
        return ResponseEntity.ok(questionService.getQuestionById(id));
    }
}



