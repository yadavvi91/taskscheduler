CREATE TABLE app_users
(
    id       SERIAL PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    enabled  BOOLEAN      NOT NULL
);

CREATE TABLE app_authorities
(
    id        SERIAL PRIMARY KEY,
    authority VARCHAR(255) NOT NULL
);

CREATE TABLE app_user_authorities
(
    user_id      INT,
    authority_id INT,
    PRIMARY KEY (user_id, authority_id),
    FOREIGN KEY (user_id) REFERENCES app_users (id),
    FOREIGN KEY (authority_id) REFERENCES app_authorities (id)
);

