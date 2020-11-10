CREATE TABLE student (
    id int not null primary key,
    firstname varchar(255) not null,
    lastname varchar(255) not null,
    street varchar(255) not null,
    zipcode int not null,
    state varchar(50) not null,
    city varchar(255) not null,
    phone varchar(50) not null,
    email varchar(50) not null,
    fdate varchar(50) not null,
    visited_at timestamp
);