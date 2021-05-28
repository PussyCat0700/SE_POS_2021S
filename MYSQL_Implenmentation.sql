create database POSSystem;
create table productDescription(
id char(30),
name varchar(50),
price decimal(5,2) not null default 0.0 check (price>0),
primary key (id) 
);
insert into productDescription values(“001”,”Apple”,8.9);
insert into productDescription values(“002”,”Orange”,4.3);
insert into productDescription values(“003”,”Banana”,6.9);
