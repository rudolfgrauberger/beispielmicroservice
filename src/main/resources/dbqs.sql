create database sbtut1;
create database sbtut2;

create user 'sbtut1'@'localhost' identified by 'knet-lol';
create user 'sbtut2'@'localhost' identified by 'knet-lol';

grant all on sbtut1.* to 'sbtut1'@'localhost';
grant all on sbtut2.* to 'sbtut2'@'localhost';