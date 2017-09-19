/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50713
Source Host           : localhost:3306
Source Database       : cipher

Target Server Type    : MYSQL
Target Server Version : 50713
File Encoding         : 65001

Date: 2017-09-19 18:15:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for call
-- ----------------------------
DROP TABLE IF EXISTS `call`;
CREATE TABLE `call` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `called_uid` int(11) NOT NULL,
  `start_time` datetime NOT NULL,
  `end_time` datetime NOT NULL,
  `location` varchar(255) DEFAULT NULL,
  `content_id` int(11) NOT NULL,
  `calling_nbr` varchar(255) DEFAULT NULL,
  `called_nbr` varchar(255) DEFAULT NULL,
  `access_nbr` varchar(255) DEFAULT NULL,
  `oper_list_id` int(11) DEFAULT NULL,
  `ticket_id` int(11) DEFAULT NULL,
  `called_msc_addr` varchar(255) DEFAULT NULL,
  `calling_msc_addr` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=68 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of call
-- ----------------------------
INSERT INTO `call` VALUES ('60', '1', '2', '2017-08-19 18:12:24', '2017-08-18 18:22:31', '武汉大学', '61', '15527185212', '17607185613', null, '62', '63', '武汉大学', '武汉大学');
INSERT INTO `call` VALUES ('67', '2', '1', '2017-09-14 18:14:12', '2017-09-14 18:24:17', '武汉大学', '68', '17607185613', '15527185212', null, '69', '70', '武汉大学', '武汉大学');

-- ----------------------------
-- Table structure for cipher_fields
-- ----------------------------
DROP TABLE IF EXISTS `cipher_fields`;
CREATE TABLE `cipher_fields` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `table_name` varchar(255) DEFAULT NULL,
  `field_name` varchar(255) DEFAULT NULL,
  `status` tinyint(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cipher_fields
-- ----------------------------

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cust_id` int(11) DEFAULT NULL,
  `cust_pwd` varchar(255) DEFAULT NULL,
  `cust_name` varchar(255) DEFAULT NULL,
  `cust_sex` varchar(255) DEFAULT NULL,
  `cust_nbr` varchar(255) DEFAULT NULL,
  `register_time` datetime DEFAULT NULL,
  `login_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('1', '1', '123123', '陈史', '男', '15527185212', '2017-09-05 15:03:08', '2017-09-05 15:03:13', '2017-09-05 15:03:22');
INSERT INTO `customer` VALUES ('2', '2', '123123', '卢苏', '女', '17607185613', '2017-08-24 15:28:49', '2017-09-11 15:28:54', '2017-09-04 15:28:59');

-- ----------------------------
-- Table structure for customer_info
-- ----------------------------
DROP TABLE IF EXISTS `customer_info`;
CREATE TABLE `customer_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cust_id` int(11) DEFAULT NULL,
  `cust_idcard` varchar(255) DEFAULT NULL,
  `nativity_address` varchar(255) DEFAULT NULL,
  `cust_email` varchar(255) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer_info
-- ----------------------------
INSERT INTO `customer_info` VALUES ('1', '1', '2013302580112', '湖北武汉大学', 'chrff@126.com', '2015-03-05', '2017-09-05 15:04:46');

-- ----------------------------
-- Table structure for manager
-- ----------------------------
DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `manager_id` int(11) DEFAULT NULL,
  `manager_pwd` varchar(255) DEFAULT NULL,
  `manager_name` varchar(255) DEFAULT NULL,
  `manager_sex` varchar(255) DEFAULT NULL,
  `manager_nbr` varchar(255) DEFAULT NULL,
  `register_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `status` tinyint(2) DEFAULT NULL,
  `active_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manager
-- ----------------------------
INSERT INTO `manager` VALUES ('10', '11', '123123', '卢桃', '女', '15527185222', '2017-09-05 15:05:35', '2017-09-05 15:05:37', '1', null, null);

-- ----------------------------
-- Table structure for manager_info
-- ----------------------------
DROP TABLE IF EXISTS `manager_info`;
CREATE TABLE `manager_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `manager_id` int(11) DEFAULT NULL,
  `manager_idcard` varchar(255) DEFAULT NULL,
  `nativity_address` varchar(255) DEFAULT NULL,
  `manager_email` varchar(255) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manager_info
-- ----------------------------
INSERT INTO `manager_info` VALUES ('10', '11', '2013302580121', '湖北省武汉市武汉大学', 'simpleFox@126.com', '2016-08-11', 'IT');

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) DEFAULT NULL,
  `receive_id` int(11) DEFAULT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `context` varchar(255) DEFAULT NULL,
  `send_nbr` varchar(255) DEFAULT NULL,
  `receive_nbr` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES ('20', '1', '2', '2017-09-18 17:58:51', '2017-09-18 17:58:54', '武汉大学', '你好！这里是武汉大学，欢迎你就读', '15527185212', '17607185613');
INSERT INTO `message` VALUES ('21', '2', '1', '2017-09-19 18:00:32', '2017-09-19 18:00:35', '武汉大学', '谢谢O(∩_∩)O谢谢', '17607185613', '15527185212');

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `prod_id` int(11) NOT NULL,
  `prod_name` varchar(255) NOT NULL,
  `create_date` datetime DEFAULT NULL,
  `begin_rent_time` datetime DEFAULT NULL,
  `stop_rent_time` datetime DEFAULT NULL,
  `finish_time` datetime DEFAULT NULL,
  `address_id` int(11) DEFAULT NULL,
  `location_id` int(11) DEFAULT NULL,
  `mod_time` datetime NOT NULL,
  `handle_org_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('30', '31', '学生套餐', '2017-09-19 18:03:25', '2017-09-19 18:03:30', '2018-08-18 18:03:33', '2018-08-18 18:03:42', '32', '33', '2017-09-19 18:04:03', '34');

-- ----------------------------
-- Table structure for type_field
-- ----------------------------
DROP TABLE IF EXISTS `type_field`;
CREATE TABLE `type_field` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) DEFAULT NULL,
  `field_id` int(11) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of type_field
-- ----------------------------
INSERT INTO `type_field` VALUES ('40', '1', '42', null);

-- ----------------------------
-- Table structure for type_permission
-- ----------------------------
DROP TABLE IF EXISTS `type_permission`;
CREATE TABLE `type_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) DEFAULT NULL,
  `max_time` date DEFAULT NULL,
  `max_msgNumber` int(11) DEFAULT NULL,
  `max_callNumber` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of type_permission
-- ----------------------------
INSERT INTO `type_permission` VALUES ('42', '1', '2017-11-25', '50', '50');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) NOT NULL COMMENT '用户名',
  `user_pwd` varchar(20) NOT NULL COMMENT '用户密码',
  `user_email` varchar(20) NOT NULL COMMENT '用户邮箱',
  `register_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间',
  `nick_name` varchar(20) DEFAULT NULL COMMENT '昵称',
  `status` tinyint(1) NOT NULL DEFAULT '1' COMMENT '账户状态',
  `sex` varchar(1) DEFAULT NULL COMMENT '性别',
  `birth` date DEFAULT NULL COMMENT '出生日期',
  `profile` varchar(500) DEFAULT NULL COMMENT '个人简介',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`user_name`) USING HASH,
  UNIQUE KEY `email` (`user_email`) USING HASH,
  UNIQUE KEY `id` (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8 COMMENT='用户信息表';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('51', '陈瀚榕', '123123', 'chh@126.com', '2017-09-19 18:10:15', null, '1', '男', '2013-06-19', null);
