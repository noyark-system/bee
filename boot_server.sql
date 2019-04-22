CREATE DATABASE boot_server;

USE boot_server;

-- 用户
CREATE TABLE user (
  uid INT COMMENT '用户的id',
  username VARCHAR(20) COMMENT '用户的名字',
  nickname VARCHAR(20) COMMENT '用户的昵称',
  password VARCHAR(20) COMMENT '密码',
  gender INT COMMENT '0-男，1-女',
  phone VARCHAR (20) COMMENT '手机号码',
  salt CHAR(36) COMMENT '盐值',
  level VARCHAR(20) COMMENT '用户等级',
  address VARCHAR(50) COMMENT '用户的居住地',
  birthday DATETIME COMMENT '用户的出生年月日',
  created_user VARCHAR(20) COMMENT '创建者',
  modified_user VARCHAR(20) COMMENT '修改者',
  created_time DATETIME COMMENT '创建时间',
  modified_time  DATETIME COMMENT '修改时间',
  is_delete INT COMMENT '是否被删除，0-未删除，1-已经删除',
  avatar VARCHAR(50) COMMENT '头像，路径',
  is_admin INT COMMENT '是否是管理员',
  is_ban INT COMMENT '是否被封禁',
  ban_date DATE COMMENT '解封时间'
);
