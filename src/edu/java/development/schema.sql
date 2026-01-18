DROP TABLE flight;

CREATE TABLE flight (
    id SERIAL PRIMARY KEY,
     flight_number VARCHAR(20),
        origin VARCHAR(50),
          destination VARCHAR(50)
);
DROP TABLE passenger;

CREATE TABLE Passenger (
    id SERIAL PRIMARY KEY,
        name VARCHAR(50),
    email VARCHAR(100)
);