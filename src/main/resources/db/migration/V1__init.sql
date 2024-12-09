CREATE TABLE click
(
    id         UUID NOT NULL,
    created_at TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    CONSTRAINT pk_click PRIMARY KEY (id)
);