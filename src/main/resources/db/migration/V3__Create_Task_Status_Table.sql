CREATE TABLE task_status
(
    id                  INT PRIMARY KEY,
    task_id             INT,
    user_id             INT,
    status              VARCHAR(255),
    progress_percentage INT,
    timestamp           TIMESTAMP,
    FOREIGN KEY (task_id) REFERENCES tasks (id) ON DELETE CASCADE, -- Delete taskStatus when task is deleted
    FOREIGN KEY (user_id) REFERENCES users (id)                    -- No ON DELETE CASCADE for users
);
