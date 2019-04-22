--帖子
CREATE DATABASE boot_server CHARACTER SET = UTF8;

USE boot_server;

-- 一个帖子的基本信息

CREATE TABLE post(
  sid INT AUTO_INCREMENT PRIMARY KEY NOT NULL COMMENT '帖子的id号',
  uid INT NOT NULL COMMENT '发帖的用户的id，即楼主',
  title VARCHAR (100) COMMENT '帖子标题',
  module_id INT COMMENT '所属模块的id',
  created_user VARCHAR(20) COMMENT '创建者',
  modified_user VARCHAR(20) COMMENT '修改者',
  created_time DATETIME COMMENT '创建时间',
  modified_time  DATETIME COMMENT '修改时间',
  is_delete INT COMMENT '是否被删除，0-未删除，1-已经删除',
  create_time INT COMMENT '创建的时间',
  content TEXT COMMENT '楼主帖子的内容'
);

-- 关系表
/*
一个帖子对应多个回复
 */
CREATE TABLE relation(
  sid INT COMMENT '帖子的id',
  reply_id INT COMMENT '回复的id'
);

-- 回复表

CREATE TABLE reply(
  reply_id INT  AUTO_INCREMENT PRIMARY KEY NOT NULL COMMENT '回复的id',
  content TEXT COMMENT '回复的内容',
  uid INT COMMENT '用户的id',
  create_time DATETIME COMMENT '创建时间',
  is_delete INT COMMENT '是否被删除',
);

