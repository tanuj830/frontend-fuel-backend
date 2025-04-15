package com.frontendfuel.v1.dto;

import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private String id;
    private String username;
    private String email;
    private List<QuestionDTO> solvedQuestions;
}
