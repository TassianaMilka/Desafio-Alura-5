create table forum(

    id bigint not null auto_increment,
    nome varchar(100) not null,
    email varchar(100) not null unique,
    crm varchar(6) not null unique,
    telefone varchar(20),
    uf char(2) not null,
    cidade varchar(100) not null,

    primary key(id)

);