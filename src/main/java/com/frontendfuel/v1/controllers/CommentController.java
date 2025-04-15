package com.frontendfuel.v1.controllers;

import com.frontendfuel.v1.dto.*;
import com.frontendfuel.v1.services.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comments")
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @PostMapping
    public ResponseEntity<CommentDTO> create(@RequestBody CommentDTO dto) {
        return ResponseEntity.ok(commentService.createComment(dto));
    }
}