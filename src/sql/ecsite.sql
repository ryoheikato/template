drop database if exists ecsite;

create database if not exists ecsite;
use ecsite;

drop table if exists login_user_info;

create table login_user_info(
id int not null primary key auto_increment,
login_id varchar(16) unique,
login_pass varchar(16),
user_name varchar(50),
insert_date datetime,
updated_date datetime
);

drop table if exists reservation_info;

create table reservation_info(
user_id int not null primary key auto_increment,
reservation_id int not null primary key auto_increment,
room_name varchar(30),
reservation_price int,
item_image varchar(255) not null,
am_flag int,
pm_flag int,
room_flag boolean default false,
reservation_time varchar(15) not null
);



INSERT INTO reservation_info(reservation_id, room_name, reservation_price, item_image) VALUES
(1, "ルームA", 1000,"img/roomA.jpg"),
(2, "ルームB", 2000,"img/roomB.jpg"),
(3, "ルームC", 3000,"img/roomC.jpg"),
(4, "ルームD", 4000,"img/roomD.jpg"),
(5, "ルームE", 5000,"img/roomE.jpg");


INSERT INTO login_user_info(login_id, login_pass, user_name) VALUES
("internous", "internous01", "test");

