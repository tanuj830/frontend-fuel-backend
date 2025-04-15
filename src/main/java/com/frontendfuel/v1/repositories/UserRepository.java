package com.frontendfuel.v1.repositories;
import com.frontendfuel.v1.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
