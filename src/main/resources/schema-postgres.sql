CREATE TABLE IF NOT EXISTS routes (
    id SERIAL PRIMARY KEY,

    city_to   VARCHAR(255) NOT NULL,
    city_from VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS buses (
    id SERIAL PRIMARY KEY,

    vendor VARCHAR(255),
    model  VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS seats (
    id SERIAL PRIMARY KEY,

    position INT NOT NULL,
    busId    INT NOT NULL,

    FOREIGN KEY (busId) REFERENCES buses(id)

);
