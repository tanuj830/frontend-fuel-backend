package com.frontendfuel.v1.repositories;
import com.frontendfuel.v1.entities.Tag;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TagRepository extends MongoRepository<Tag, String> {
}
