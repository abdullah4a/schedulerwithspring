package com.example.scheduler.repositories;

import com.example.scheduler.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
