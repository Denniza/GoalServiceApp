delete from message;

insert into message(id, text, tag, user_id) values
(1, 'first','smtag',1),
(2, 'second','smtag',1),
(3, 'fhird','tag',1);


alter sequence hibernate_sequence restart with 10;

