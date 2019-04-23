-- 关注与粉丝表

-- @author jack

CREATE DATABASE boot_server CHARACTER SET = UTF8;

USE boot_server;

CREATE TABLE following_list(
  uid INT COMMENT '关注者',
  followed_user INT '被关注者',
);
