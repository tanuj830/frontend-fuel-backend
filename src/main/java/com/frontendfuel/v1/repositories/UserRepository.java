package com.frontendfuel.v1.repositories;

import com.frontendfuel.v1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
