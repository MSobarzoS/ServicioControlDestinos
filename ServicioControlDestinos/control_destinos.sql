CREATE DATABASE control_destinos;

USE control_destinos;

CREATE TABLE pasajero(
id_pasajero INT auto_increment not null primary key,
rut VARCHAR(20),
nombre VARCHAR(20),
apellido VARCHAR(30),
edad INT,
ciudad_natal VARCHAR(50)
);

CREATE TABLE destino(
id_destino INT auto_increment  not null primary key,
ciudad VARCHAR(20),
pais VARCHAR(20),
fecha VARCHAR(10),
id_pasajero INT,
foreign key (id_pasajero) references pasajero(id_pasajero)
);

Select *
From pasajero;

Select *
From destino;