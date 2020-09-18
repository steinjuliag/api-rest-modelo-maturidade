	 CREATE TABLE categoria (
     	id serial PRIMARY KEY,
     	nome VARCHAR ( 50 ) UNIQUE NOT NULL
     );

     insert into categoria (nome) values ('Supermercado');
     insert into categoria (nome) values ('Farmácia');
     insert into categoria (nome) values ('Cinema');
     insert into categoria (nome) values ('Roupas');
     insert into categoria (nome) values ('Arte');