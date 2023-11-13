CREATE TABLE tasks
(
    id          INT PRIMARY KEY,
    title       VARCHAR(255),
    description VARCHAR(255),
    due_date    DATE,
    user_id     INT,
    FOREIGN KEY (user_id) REFERENCES users (id)
);
