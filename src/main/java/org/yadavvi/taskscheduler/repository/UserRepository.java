package org.yadavvi.taskscheduler.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yadavvi.taskscheduler.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
