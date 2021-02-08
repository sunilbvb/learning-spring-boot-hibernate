
create table person(id integer not null, name varchar(32) not null, location varchar(255), birth_date timestamp, primary key(id));


insert into person(id, name, location, birth_date) values(10001, 'Ranga', 'Hyderabad', sysdate());
insert into person(id, name, location, birth_date) values(10002, 'Sunil', 'Gadag', sysdate());
insert into person(id, name, location, birth_date) values(10003, 'Krishna', 'Gadag', sysdate());