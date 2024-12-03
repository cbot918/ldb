create table Employees(
	id varchar(255) not null,
    firstname varchar(255),
    lastname varchar(255),
    age int,
    PRIMARY KEY (id)
);

insert into Employees values
	("a001","yale","hsu",20),
	("a002", "node","hsu",20),
	("a003", "kenny","hsu",20)
    ;