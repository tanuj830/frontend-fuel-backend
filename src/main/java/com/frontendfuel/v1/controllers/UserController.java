package com.frontendfuel.v1.controllers;


import com.frontendfuel.v1.dto.*;
import com.frontendfuel.v1.services.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserDTO> create(@RequestBody UserDTO dto) {
        return ResponseEntity.ok(userService.createUser(dto));
    }

    // @GetMapping("/{id}/solved")
    // public ResponseEntity<List<QuestionDTO>> getSolvedQuestions(@PathVariable String id) {
    //     return ResponseEntity.ok(userService.getSolvedQuestions(id));
    // }
}