-- 板块和模块的划分

-- @author magiclu
-- @author kevin.J

CREATE DATABASE boot_server CHARACTER SET = UTF8;

USE boot_server;

-- 板块

CREATE TABLE plate(
  pid INT AUTO_INCREMENT PRIMARY KEY NOT NULL COMMENT '板块的id',
  plate_name VARCHAR (20) COMMENT '板块名字',
  admin_uid INT COMMENT '管理员',
  created_user VARCHAR(20) COMMENT '创建者',
  modified_user VARCHAR(20) COMMENT '修改者',
  created_time DATETIME COMMENT '创建时间',
  modified_time  DATETIME COMMENT '修改时间',
  comment VARCHAR (50) COMMENT '悬浮窗备注'
);

-- 关系表

CREATE TABLE relation(
  pid INT COMMENT '板块的id',
  mid INT COMMENT '模块的id',
);

-- 模块

CREATE TABLE model(
  mid INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
  model_name VARCHAR (20),
  created_user VARCHAR(20) COMMENT '创建者',
  modified_user VARCHAR(20) COMMENT '修改者',
  created_time DATETIME COMMENT '创建时间',
  modified_time  DATETIME COMMENT '修改时间',
  picture VARCHAR (50) COMMENT '模块图片',
  comment VARCHAR (50) COMMENT '悬浮窗备注'
);