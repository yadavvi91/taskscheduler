package org.yadavvi.taskscheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yadavvi.taskscheduler.model.Task;
import org.yadavvi.taskscheduler.model.TaskStatus;

import java.util.Optional;

@Repository
public interface TaskStatusRepository extends JpaRepository<TaskStatus, Long> {
    Optional<TaskStatus> findTopByTaskOrderByTimestampDesc(Task task);
}
