create database Overbookin;

create table passageiros(id int primary key auto_increment, nome varchar(50), cpf varchar(50), categoria varchar(50), lugar int);

create table voos(id int primary key auto_increment, idVoo int);

create table vooPassageiros(id int primary key auto_increment, idVoo int foreign key(idVoo) references voos(id), idPassageiro int foreign key(idPassageiro) references passageiros(id));