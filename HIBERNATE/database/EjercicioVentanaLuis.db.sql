
create table persona (
id int(11) NOT NULL,
nombre varchar(50) DEFAULT NULL,
altura double DEFAULT NULL,
peso double DEFAULT NULL,
edad int(11) DEFAULT NULL,
PRIMARY KEY (id)
);

create table grupo (
id int(11) NOT NULL,
nombre varchar(50) DEFAULT NULL,
nombreDirector varchar(50) DEFAULT NULL,
edadMinima int(11) DEFAULT NULL,
horario varchar(50) DEFAULT NULL,
personaId int DEFAULT NULL,
PRIMARY KEY (id),
FOREIGN KEY ( personaId) REFERENCES persona (id) ON DELETE CASCADE
);

CREATE TABLE lugar (
id int(11) NOT NULL,
nombre varchar(50) DEFAULT NULL,
direccion varchar(50) DEFAULT NULL,
numeroEdif int(11) DEFAULT NULL,
horario varchar(50) DEFAULT NULL,
grupoId INT DEFAULT NULL,
PRIMARY KEY (id),
FOREIGN KEY ( grupoId ) REFERENCES grupo (id) ON DELETE CASCADE
);

CREATE TABLE ciudad (
id int(11) NOT NULL,
nombre varchar(50) DEFAULT NULL,
pais varchar(50) DEFAULT NULL,
provincia varchar(50) DEFAULT NULL,
edificioEmblematico varchar(50) DEFAULT NULL,
lugarId int DEFAULT NULL,
PRIMARY KEY (id),
FOREIGN KEY ( lugarId ) REFERENCES lugar (id) ON DELETE CASCADE
);
