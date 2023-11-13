package org.yadavvi.taskscheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;
import org.yadavvi.taskscheduler.model.UserSpringSecurity;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserSpringSecurity, String> {
    Optional<UserDetails> findByUsername(String username);
}
