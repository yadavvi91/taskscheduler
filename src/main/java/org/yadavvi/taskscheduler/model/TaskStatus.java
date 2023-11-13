package org.yadavvi.taskscheduler.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "task_status")
public class TaskStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String status;
    @Column(name = "progress_percentage")
    private int progressPercentage;
    private LocalDateTime timestamp;
}