create table Person(
                       PersonId int primary key,
                       FirstName varchar(20),
                       LastName varchar(20)
);


create table Address (
                         AddressId int primary key,
                         PersonId int,
                         City varchar(20),
                         State varchar(20)
);


insert into Person values(1, 'john', 'doe');
insert into Person values(2, 'jane', 'doe');
insert into Person values(3, 'jason', 'ma');

insert into Address values(1, 3, 'Shanghai', 'SH');


select  p.FirstName, p.LastName, a.City, a.State from Person p
                                                          left join Address a on p.PersonId = a.PersonId  ;