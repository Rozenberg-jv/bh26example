create database bh26example;
use bh26example;

create table accounts (
                          id int primary key auto_increment,
                          username varchar(50) unique not null,
                          password varchar(50) not null check (password != ''),
                          money int not null check (money >= 0)
);

create table transactions (
                              id int primary key auto_increment,
                              sender int not null,
                              receiver int not null,
                              time datetime not null,
                              amount int not null check (amount >= 0),
                              status varchar(50),
                              foreign key (sender) references accounts(id),
                              foreign key (receiver) references accounts(id)
);

insert into accounts values
(null, 'Vasily', '123', 1000),
(null, 'Tatyana', '123', 1000),
(null, 'Oleg', '123', 0),
(null, 'Igor', '123', 1000);