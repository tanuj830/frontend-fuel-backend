package com.frontendfuel.v1.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommentDTO {
    private String id;
    private String content;
    private String userId;
    private String questionId;
    private String userid; // Optional: helpful when showing comments
}
