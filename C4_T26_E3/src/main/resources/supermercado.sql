DROP DATABASE IF EXISTS supermercado;

CREATE DATABASE supermercado;
USE supermercado;

CREATE TABLE cajeros(
codigo INT NOT NULL AUTO_INCREMENT,
nombre_apellidos VARCHAR(255),
PRIMARY KEY(codigo)
);
CREATE TABLE productos(
codigo INT NOT NULL AUTO_INCREMENT,
nombre VARCHAR(100),
precio INT,
PRIMARY KEY (codigo)
);

CREATE TABLE maquinas_registradoras(
codigo INT NOT NULL AUTO_INCREMENT,
piso INT,
PRIMARY KEY (codigo)
);

CREATE TABLE venta(
id INT NOT NULL AUTO_INCREMENT,
cajero INT NOT NULL,
maquina INT NOT NULL,
producto INT NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (cajero) REFERENCES Cajeros(codigo),
FOREIGN KEY (maquina) REFERENCES Maquinas_registradoras(codigo),
FOREIGN KEY (producto) REFERENCES Productos(codigo)
);