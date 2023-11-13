-- Default admin user
INSERT INTO app_users (username, password, enabled)
VALUES ('admin', 'password', true);

-- Default roles
INSERT INTO app_authorities (authority)
VALUES ('ROLE_ADMIN'),
       ('ROLE_USER');

-- Assign roles to the admin user
INSERT INTO app_user_authorities (user_id, authority_id)
VALUES ((SELECT id FROM app_users WHERE username = 'admin'),
        (SELECT id FROM app_authorities WHERE authority = 'ROLE_ADMIN'));
