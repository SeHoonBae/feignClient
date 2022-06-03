INSERT INTO USERS (user_id, user_name) VALUES ('hong', '홍길동');
INSERT INTO USERS (user_id, user_name) VALUES ('kang', '강길동');
INSERT INTO USERS (user_id, user_name) VALUES ('kim', '김길동');

-- INSERT INTO BOARD (id, title, content) values (1, 'mapstruct', 'map struct 사용예제');
-- INSERT INTO BOARD (id, title, content) values (2, 'JPA', 'jpa 사용예제');
-- INSERT INTO BOARD (id, title, content) values (3, 'Docker', 'Docker 사용예제');

INSERT INTO BOARD (id, title, content, user_id) values (1, 'mapstruct', 'map struct 사용예제', 'hong');
INSERT INTO BOARD (id, title, content, user_id) values (2, 'JPA', 'jpa 사용예제', 'hong');
INSERT INTO BOARD (id, title, content, user_id) values (3, 'Docker', 'Docker 사용예제', 'kang');