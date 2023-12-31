package org.yadavvi.taskscheduler.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yadavvi.taskscheduler.model.User;

import java.util.Optional;

@Repository
public interface TaskUserRepository extends JpaRepository<User, String> {
    Optional<User> findByUsername(String username);
}
