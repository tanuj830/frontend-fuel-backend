package com.frontendfuel.v1.repositories;

import com.frontendfuel.v1.entities.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, String> {
    // Additional methods if needed
}
