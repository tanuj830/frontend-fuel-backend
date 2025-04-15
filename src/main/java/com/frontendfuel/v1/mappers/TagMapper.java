package com.frontendfuel.v1.mappers;

import com.frontendfuel.v1.dto.TagDTO;
import com.frontendfuel.v1.entities.Tag;

public class TagMapper {

    // Convert Tag entity to TagDTO
    public static TagDTO toDTO(Tag tag) {
        if (tag == null) {
            return null;
        }

        return TagDTO.builder()
                .id(tag.getId())
                .name(tag.getName())
                .build();
    }

    // Convert TagDTO to Tag entity
    public static Tag toEntity(TagDTO tagDTO) {
        if (tagDTO == null) {
            return null;
        }

        return Tag.builder()
                .id(tagDTO.getId())
                .name(tagDTO.getName())
                .build();
    }
}
