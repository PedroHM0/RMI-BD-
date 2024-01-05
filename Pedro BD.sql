create database cinema;
use cinema;
#drop database cinema;
create table filme_id(
	id_filme integer primary key not null auto_increment
);

create table filme(
	id_filme integer not null,
    nome_filme varchar(30) not null,
    foreign key (id_filme) references filme_id(id_filme)
);

create table espaco(
	id_filme integer not null,
	vagas integer,
    preco float,
    foreign key (id_filme) references filme_id(id_filme)
);

#select * from filme_id;
#select*from filme;
#select*from espaco;

