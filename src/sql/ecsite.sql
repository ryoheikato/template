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
reservation_id int not null primary key auto_increment,
room_name varchar(30),
reservation_price int,
num_of_user int,
phone_num varchar(20),
reservation_date timestamp default 0,
reservation_time int(5)
insert_date timestamp default 0,
update_date current_timestamp on update current_timestamp,
delete_date timestamp
);

drop table if exists user_buy_item_transaction;

create table user_buy_item_transaction(
id int not null primary key auto_increment,
item_transaction_id int,
total_price int,
total_count int,
user_master_id varchar(16),
pay varchar(30),
insert_date datetime,
delete_date datetime
);


INSERT INTO reservation_info(room_name, reservation_price,item_image) VALUES
("ルームA", 1000,".img/roomA.jpeg"),
("ルームB", 2000,".img/roomB.jpeg"),
("ルームC", 3000,".img/roomC.jpeg"),
("ルームD", 4000,".img/roomD.jpeg"),
("ルームE", 5000,".img/roomE.jpeg");
INSERT INTO login_user_info(login_id, login_pass, user_name) VALUES
("internous", "internous01", "test");

