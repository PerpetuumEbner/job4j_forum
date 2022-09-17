insert into authorities (authority)
values ('ROLE_USER');
insert into authorities (authority)
values ('ROLE_ADMIN');

insert into users (username, enabled, password, authority_id)
values ('admin', true, '$2a$10$9vt5bjcdwu9alVKnTf2TjuTTMfJSa8fnWQ8YuTm9kgLPuwK5ImzCC',
        (select id from authorities where authority = 'ROLE_ADMIN'));