create table peliculas(
codigo int not null primary key,
nombre varchar(100),
edad int not null
);

create table salas(
codigo int not null primary key,
nombre varchar(100),
pelicula int,
foreign key(pelicula) references peliculas(codigo)
);

insert into peliculas(codigo,nombre,edad)
values(1,'Batman',16),(2,'Piratas del Caribe',12),(3,'Avatar',5);

insert into salas(codigo,nombre,pelicula)
values(1,'sala1',1),(2,'sala2',2),(3,'sala3',3),(4,'sala1',1);