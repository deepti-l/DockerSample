CREATE TABLE USER (
	 id integer not null AUTO_INCREMENT,
     date_of_birth varchar(255),
     first_name varchar(255),
     last_name varchar(255),
     password varchar(255),
     user_name varchar(255),
     primary key (id)
);



insert into USER (date_of_birth, first_name, last_name, password, user_name) values ('10/09/1919','Deepti', 'Lalwani','deepti','deepti');