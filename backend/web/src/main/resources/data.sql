DROP TABLE IF EXISTS CHALLENGES;
CREATE TABLE CHALLENGES (
    id INT AUTO_INCREMENT PRIMARY KEY,
    ROUTINE_NAME1 VARCHAR(30),
    ROUTINE_NAME2 VARCHAR(30),
    ROUTINE_NAME3 VARCHAR(30),
    ROUTINE_NAME4 VARCHAR(30),
    ROUTINE_NAME5 VARCHAR(30),
    CHALLENGE_NAME VARCHAR(30)
) DEFAULT CHARSET=utf8;
commit;