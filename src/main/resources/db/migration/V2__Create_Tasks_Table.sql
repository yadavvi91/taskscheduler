CREATE TABLE tasks
(
    id          INT PRIMARY KEY,
    title       VARCHAR(255),
    description VARCHAR(255),
    dueDate     DATE,
    userId      INT,
    FOREIGN KEY (userId) REFERENCES users (id)
);
