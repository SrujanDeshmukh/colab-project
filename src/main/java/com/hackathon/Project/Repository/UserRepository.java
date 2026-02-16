package com.hackathon.Project.Repository;

import com.hackathon.Project.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
