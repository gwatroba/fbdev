CREATE TABLE profile (profile_id SERIAL PRIMARY KEY, username VARCHAR(25) UNIQUE NOT NULL, password VARCHAR(25) NOT NULL, enabled INTEGER NOT NULL DEFAULT 1 , role varchar(15) NOT NULL DEFAULT 'ROLE_USER' , firstname VARCHAR(25) NOT NULL, lastname VARCHAR(25) NOT NULL, email VARCHAR(30) UNIQUE, created DATE NOT NULL);

CREATE TABLE message (message_id SERIAL PRIMARY KEY, message TEXT NOT NULL, created TIMESTAMP NOT NULL, profile_id INTEGER NOT NULL REFERENCES profile (profile_id));

INSERT INTO profile (username, password, firstname, lastname, email, created) VALUES ('grisza', 'grisza', 'Grzegorz', 'Watroba', 'grisza@interia.pl', '2015-12-23');
INSERT INTO message (message, created, profile_id) VALUES ('Siema tu grisza', '2015-12-23', 1);