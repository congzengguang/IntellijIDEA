/*
Navicat MySQL Data Transfer

Source Server         : mldn
Source Server Version : 50022
Source Host           : 127.0.0.1:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 50022
File Encoding         : 65001

Date: 2015-06-13 20:05:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for emp
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp` (
  `empno` int(11) NOT NULL,
  `ename` varchar(100) default NULL,
  `job` varchar(50) default NULL,
  `hiredate` datetime default NULL,
  `sal` double default NULL,
  `comm` double default NULL,
  PRIMARY KEY  (`empno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of emp
-- ----------------------------
INSERT INTO `emp` VALUES ('1234', '张三', '清洁工', '2015-06-13 19:10:20', '100', '100');
