--等级称号

-- @author magiclu

CREATE DATABASE boot_server CHARACTER SET = UTF8;

USE boot_server;

CREATE TABLE level(
  level_id INT PRIMARY KEY AUTO_INCREMENT UNIQUE NOT NULL COMMENT '等级的id',
  level_name VARCHAR (20) COMMENT '等级的称号'
);

-- 插入等级

INSERT INTO level VALUES (1,'初学者'),
                         (2,'游学者'),
                         (3,'有智者'),
                         (4,'智者'),
                         (5,'仁师'),
                         (6,'仁者 '),
                         (7,'尊者'),
                         (8,'大智尊'),
                         (9,'坛圣');