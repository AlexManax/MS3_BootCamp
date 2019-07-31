CREATE DATABASE IF NOT EXISTS starTrackShips
    COLLATE utf8_general_ci;

USE starTrackShips;

DROP TABLE IF EXISTS ship;

CREATE TABLE ship
(
    idShip   INTEGER  NOT NULL AUTO_INCREMENT,
    nameShip VARCHAR(50) NULL,
    crewSize INTEGER(4)  NULL,
    speed    double      NULL,
    PRIMARY KEY (idShip)
)
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8;

INSERT INTO ship(nameShip, crewSize, speed)
values ('USS Enterprise', 5, 9.9),
       ('Mayflyer', 3, 9.7);


DROP TABLE IF EXISTS crewMembers;

CREATE TABLE crewMembers
(
    idMember   INTEGER(5)  NOT NULL AUTO_INCREMENT,
    nameMember VARCHAR(50) NULL,
    rankMember INTEGER(2)  NULL,
    idShip     INTEGER(4)  NULL,
    PRIMARY KEY (idMember)
)
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8;

INSERT INTO crewMembers(nameMember, rankMember, idShip)
values ('Capitan Kirk', 10, 1),
       ('Capitan Black', 10, 1),
       ('Spoke', 10, 2);

# insert into ship(name, planet, shipType, prodDate, isUsed, speed, crewSize, rating)
# values ('Orion III', 'Mars', 'MERCHANT', '2995-01-01', true, 0.82, 617, 1.31)
#      , ('Daedalus', 'Jupiter', 'MERCHANT', '3001-01-01', true, 0.94, 1619, 1.98)
#      , ('Eagle Transporter', 'Earth', 'TRANSPORT', '2989-01-01', true, 0.79, 4527, 1.02)
#      , ('F-302 Mongoose', 'Neptune', 'MILITARY', '3011-01-01', false, 0.24, 2170, 2.13)