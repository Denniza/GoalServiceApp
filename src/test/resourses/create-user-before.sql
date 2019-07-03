delete from user_role;
delete from usr;

insert into usr(id, active, password, username) values
(1,true,'$2a$08$QGStvq/N8OdCd1pdZ5jZCuzNBzzmGD2BWjjqqE3Fd3EDW/XKQAM9a', 'a'),
(2, true,'$2a$08$QGStvq/N8OdCd1pdZ5jZCuzNBzzmGD2BWjjqqE3Fd3EDW/XKQAM9a', 'qw');

insert into user_role(user_id, roles) VALUES
(1, 'USER'), (1, 'ADMIN'),
(2, 'USER');
