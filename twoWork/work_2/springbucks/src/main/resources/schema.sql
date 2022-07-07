create
database geek;
use
geek;

drop table if exists t_coffee;
drop table if exists t_order;

create table t_coffee
(
    id          bigint auto_increment,
    name        varchar(255),
    price       bigint,
    create_time timestamp,
    update_time timestamp,
    primary key (id)
);

create table t_order
(
    id          bigint auto_increment,
    customer    varchar(255),
    coffeeId    bigint,
    state       varchar(255) not null,
    create_time timestamp,
    update_time timestamp,
    primary key (id)
);