/*
Navicat MySQL Data Transfer

Source Server         : mldn
Source Server Version : 50022
Source Host           : 127.0.0.1:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 50022
File Encoding         : 65001

Date: 2015-06-13 20:07:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `deptno` int(11) NOT NULL default '0',
  `dname` varchar(50) default NULL,
  `loc` varchar(50) default NULL,
  PRIMARY KEY  (`deptno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('10', '财务部', '北京');
INSERT INTO `dept` VALUES ('20', '市场部', '上海');
INSERT INTO `dept` VALUES ('30', '研发部', '广州');
INSERT INTO `dept` VALUES ('40', '后勤部', '云南');
