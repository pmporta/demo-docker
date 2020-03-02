create sequence hibernate_sequence start 1 increment 1;
create table country (id int8 not null, name varchar(255), primary key (id));
create table mountainrunner (id int8 not null, age varchar(255), name varchar(255), country_id int8, primary key (id));
create table race (id int8 not null, distance varchar(255), height_gain varchar(255), name varchar(255), country_id int8, primary key (id));
create table ranking (id int8 not null, position int4, race_id int8, runner_id int8, primary key (id));
alter table mountainrunner add constraint FKh6pthkxm7tlxt71oxvsso70jb foreign key (country_id) references country;
alter table race add constraint FKgdq3h96o2mj15qx1i4qvfytgf foreign key (country_id) references country;
alter table ranking add constraint FKsjelhdihpefghtbsboe1ecf2l foreign key (race_id) references race;
alter table ranking add constraint FKg2gerq6negbd01ggqa9cm2fy1 foreign key (runner_id) references mountainrunner;
