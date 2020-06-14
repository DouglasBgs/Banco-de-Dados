USE N2
GO

CREATE TABLE dev (
  id_dev int NOT NULL,
  dev_name char(255) NOT NULL,
  PRIMARY KEY (id_dev)
);

CREATE TABLE distributor (
  id_distributor int NOT NULL,
  distributor_name char(255) NOT NULL,
  PRIMARY KEY (id_distributor)
);

CREATE TABLE game (
  id_game int NOT NULL,
  game_name char(255) NOT NULL,
  genre char(255),
  year int NOT NULL,
  id_dev int NOT NULL,
  id_distributor int NOT NULL
  PRIMARY KEY (id_game),
  FOREIGN KEY (id_dev) REFERENCES dev(id_dev),
  FOREIGN KEY (id_distributor) REFERENCES distributor(id_distributor)
);

INSERT INTO dev (id_dev, dev_name)
VALUES (1, ' Toys for Bob'),
(2, 'FromSoftware'),
(3, 'Activision'),
(4, 'Rockstar');

INSERT INTO distributor (id_distributor, distributor_name)
VALUES (1, 'Activision'),
(2, 'Take-Two');

INSERT INTO game (id_game, game_name, genre, year, id_dev, id_distributor)
VALUES (1, 'Call of Duty', 'Tiro', 2003, 3, 1),
(2, 'Sekiro', 'Ação, Aventura', 2019, 1, 1),
(3, 'GTA V', 'Ação, Aventura, Tiro', 2013, 4, 2);