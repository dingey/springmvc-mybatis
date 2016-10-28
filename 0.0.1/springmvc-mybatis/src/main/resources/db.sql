/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2016-10-28 19:56:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `permission_id` int(11) NOT NULL AUTO_INCREMENT,
  `permission_name` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`permission_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES ('1', 'test2', '2016-10-28 15:38:13');
INSERT INTO `permission` VALUES ('2', 'test2', null);
INSERT INTO `permission` VALUES ('3', 'test3', null);

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', 'admin', null);
INSERT INTO `role` VALUES ('2', 'guest', null);
INSERT INTO `role` VALUES ('3', 'user', null);

-- ----------------------------
-- Table structure for role_permission
-- ----------------------------
DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission` (
  `role_id` int(11) NOT NULL,
  `permission_id` int(11) NOT NULL,
  PRIMARY KEY (`role_id`,`permission_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_permission
-- ----------------------------
INSERT INTO `role_permission` VALUES ('1', '1');
INSERT INTO `role_permission` VALUES ('1', '2');
INSERT INTO `role_permission` VALUES ('1', '3');
INSERT INTO `role_permission` VALUES ('2', '1');
INSERT INTO `role_permission` VALUES ('2', '2');

-- ----------------------------
-- Table structure for role_user
-- ----------------------------
DROP TABLE IF EXISTS `role_user`;
CREATE TABLE `role_user` (
  `user_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_user
-- ----------------------------
INSERT INTO `role_user` VALUES ('1', '1');
INSERT INTO `role_user` VALUES ('1', '2');
INSERT INTO `role_user` VALUES ('1', '3');
INSERT INTO `role_user` VALUES ('2', '2');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'alice', null, '0cc175b9c0f1b6a831c399e269772661');
INSERT INTO `user` VALUES ('2', 'bob', null, '0cc175b9c0f1b6a831c399e269772661');
INSERT INTO `user` VALUES ('3', 'a1', null, '0cc175b9c0f1b6a831c399e269772661');
INSERT INTO `user` VALUES ('4', 'a2', null, null);
INSERT INTO `user` VALUES ('5', 'a3', null, null);
INSERT INTO `user` VALUES ('6', 'a4', null, null);
INSERT INTO `user` VALUES ('7', 'a5', null, null);
INSERT INTO `user` VALUES ('8', 'a6', null, null);
INSERT INTO `user` VALUES ('9', 'a7', null, null);
INSERT INTO `user` VALUES ('10', 'a8', null, null);
INSERT INTO `user` VALUES ('11', 'a9', null, null);
INSERT INTO `user` VALUES ('12', 'a10', null, null);
