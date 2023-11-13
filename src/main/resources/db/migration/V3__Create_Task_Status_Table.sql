CREATE TABLE task_status
(
    id                 INT PRIMARY KEY,
    taskId             INT,
    userId             INT,
    status             VARCHAR(255),
    progressPercentage INT,
    timestamp          DATETIME,
    FOREIGN KEY (taskId) REFERENCES tasks (id) ON DELETE CASCADE, -- Delete taskStatus when task is deleted
    FOREIGN KEY (userId) REFERENCES users (id)                    -- No ON DELETE CASCADE for users
);
