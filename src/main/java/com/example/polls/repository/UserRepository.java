package com.example.polls.repository;

import com.example.polls.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    <T> Optional<T> findByEmail(String email, Class<T> type);

    <T> Optional<T> findByEmailContainingOrUsernameContaining(String email, String username, Class<T> type);
}
