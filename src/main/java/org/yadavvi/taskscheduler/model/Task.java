package org.yadavvi.taskscheduler.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    private Long id;
    private String title;
    private String description;
    @Column(name = "due_date")
    private LocalDate dueDate;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
