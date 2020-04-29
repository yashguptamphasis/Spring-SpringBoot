create table person(
id integer not null,
name varchar(255) not null,
location varchar(255),
birth_date timestamp,
primary key(id)
);

insert into person values(
10001,'Yash','Hyderabad',sysdate()
);

insert into person values(
10002,'Jay','Banglore',sysdate()
);

insert into person values(
10003,'AlQueda','Bhopal',sysdate()
);