package com.example.generator.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.generator.domain.User;

public interface UserRepository extends JpaRepository<User, UUID> {

}
