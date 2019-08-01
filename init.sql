CREATE DATABASE IF NOT EXISTS startrackships
    COLLATE utf8_general_ci;

USE startrackships;

DROP TABLE IF EXISTS ship;

CREATE TABLE ship
(
    idship   INTEGER     NOT NULL AUTO_INCREMENT,
    nameship VARCHAR(50) NULL,
    crewsize INTEGER(4)  NULL,
    speed    double      NULL,
    PRIMARY KEY (idShip)
)
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8;

INSERT INTO ship(nameship, crewsize, speed)
values ('USS Enterprise', 5, 9.9),
       ('Mayflyer', 3, 9.7);


DROP TABLE IF EXISTS crewmembers;

CREATE TABLE crewmembers
(
    idmember   INTEGER(5)  NOT NULL AUTO_INCREMENT,
    namemember VARCHAR(50) NULL,
    rankmember INTEGER(2)  NULL,
    idship     INTEGER(4)  NULL,
    PRIMARY KEY (idMember)
)
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8;

INSERT INTO crewmembers(namemember, rankmember, idship)
values ('Capitan Kirk', 10, 1),
       ('Capitan Black', 10, 1),
       ('Spoke', 10, 2);

DROP TABLE IF EXISTS user;

CREATE TABLE user
(
    id                    INTEGER(5)  NOT NULL AUTO_INCREMENT,
    username              VARCHAR(50) NOT NULL,
    password              varchar(100) NOT NULL,
    authorities           VARCHAR(10)  NOT NULL,
    accountnonexpired     BOOLEAN     NOT NULL,
    accountnonlocked      BOOLEAN     NOT NULL,
    credentialsnonexpired BOOLEAN     NOT NULL,
    enabled               BOOLEAN     NOT NULL,

    PRIMARY KEY (id)
)
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8;

INSERT INTO user(username, password, authorities, accountnonexpired, accountnonlocked, credentialsnonexpired, enabled)
VALUES ('user', '$2a$10$kKmLugy7McZIHnVJaUJeCu2ZD3ochJ/4jiwUA8HimH2ZW6A7/.4Sm', 'USER', true, true, true, true),
       ('admin', '$2a$10$kKmLugy7McZIHnVJaUJeCu2ZD3ochJ/4jiwUA8HimH2ZW6A7/.4Sm', 'ADMIN', true, true, true, true);

# insert into ship(name, planet, shipType, prodDate, isUsed, speed, crewSize, rating)
# values ('Orion III', 'Mars', 'MERCHANT', '2995-01-01', true, 0.82, 617, 1.31)
#      , ('Daedalus', 'Jupiter', 'MERCHANT', '3001-01-01', true, 0.94, 1619, 1.98)
#      , ('Eagle Transporter', 'Earth', 'TRANSPORT', '2989-01-01', true, 0.79, 4527, 1.02)
#      , ('F-302 Mongoose', 'Neptune', 'MILITARY', '3011-01-01', false, 0.24, 2170, 2.13)