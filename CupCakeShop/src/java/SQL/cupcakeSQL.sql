create table Bottom
(
	id int primary key auto_increment,
    type varchar(255) unique,
    price double
);

create table Topping
(
	id int primary key auto_increment,
    type varchar(255) unique,
    price double
);

create table User
(
	id int primary key auto_increment,
    email varchar(255) unique NOT NULL,
    password varchar(255) NOT NULL,
    name varchar(255) NOT NULL
);

insert into Bottom (type, price) values 
("Chocolate", 5.00),
("Vanilla", 5.00),
("Nutmeg", 5.00),
("Pistacio", 6.00),
("Almond", 7.00);

insert into Topping (type, price) values
("Chocolate", 5.00),
("Blueberry", 5.00),
("Rasberry", 5.00),
("Crispy", 6.00),
("Strawberry", 6.00),
("Rum/Raisin", 7.00),
("Orange", 8.00),
("Lemon", 8.00),
("Blue cheese", 9.0);