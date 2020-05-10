CREATE TABLE items
(
  id int PRIMARY KEY NOT NULL,
  name text
);

CREATE SEQUENCE hibernate_sequence;
ALTER SEQUENCE hibernate_sequence OWNER TO postgres;
