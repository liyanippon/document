/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50067
Source Host           : localhost:3306
Source Database       : zhy

Target Server Type    : MYSQL
Target Server Version : 50067
File Encoding         : 65001

Date: 2014-10-22 17:05:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `deptno` int(10) unsigned NOT NULL auto_increment,
  `dname` varchar(45) NOT NULL,
  `loc` varchar(45) NOT NULL,
  PRIMARY KEY  (`deptno`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('1', '市场部', '沈阳');
INSERT INTO `dept` VALUES ('2', '技术部', '大连');
INSERT INTO `dept` VALUES ('3', '客服部', '北京');
INSERT INTO `dept` VALUES ('4', '后勤部', '抚顺');
INSERT INTO `dept` VALUES ('5', '营销部', '沈阳');
INSERT INTO `dept` VALUES ('6', '市场部', '大连');

-- ----------------------------
-- Table structure for emp
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp` (
  `empno` int(11) NOT NULL auto_increment,
  `ename` varchar(255) character set utf8 NOT NULL,
  `sex` char(1) character set utf8 NOT NULL,
  `salary` float NOT NULL,
  `comm` float(255,0) default NULL,
  `hiredate` date NOT NULL,
  `deptno` int(11) default NULL,
  PRIMARY KEY  (`empno`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of emp
-- ----------------------------
INSERT INTO `emp` VALUES ('1', '范冰冰', '女', '3000', '500', '2003-04-05', '3');
INSERT INTO `emp` VALUES ('2', '陈好', '女', '7000', '300', '2014-05-02', '2');
INSERT INTO `emp` VALUES ('3', '陈浩民', '男', '2500', null, '2005-04-05', '1');
INSERT INTO `emp` VALUES ('4', '成龙', '男', '3000', '300', '2001-04-03', '5');
INSERT INTO `emp` VALUES ('5', '刘诗诗', '女', '1500', '200', '2002-05-29', '4');
INSERT INTO `emp` VALUES ('6', '吴奇隆', '男', '2000', '2000', '2005-10-30', '6');
INSERT INTO `emp` VALUES ('7', '黄晓明', '男', '5000', '1000', '2014-09-23', '1');
INSERT INTO `emp` VALUES ('8', '金贤重', '男', '4000', '5000', '2014-09-21', '2');
INSERT INTO `emp` VALUES ('9', '金志贤', '男', '6500', '1500', '2013-02-05', '3');
INSERT INTO `emp` VALUES ('10', '林志玲', '女', '2000', null, '2012-03-05', '4');
INSERT INTO `emp` VALUES ('11', '柳岩', '女', '5000', '120', '2003-05-13', '3');
INSERT INTO `emp` VALUES ('12', '陆毅', '男', '4500', null, '2001-04-05', '5');
INSERT INTO `emp` VALUES ('13', '王诗龄', '女', '2000', '200', '2013-09-12', '5');
INSERT INTO `emp` VALUES ('14', '田亮', '男', '3000', '1500', '2014-09-05', '6');
INSERT INTO `emp` VALUES ('15', '董洁', '女', '8000', null, '2001-04-05', '1');
INSERT INTO `emp` VALUES ('16', '金轮法王', '男', '3000', '500', '2009-06-08', null);

-- ----------------------------
-- Table structure for grade
-- ----------------------------
DROP TABLE IF EXISTS `grade`;
CREATE TABLE `grade` (
  `grade` int(255) NOT NULL auto_increment,
  `min_salary` decimal(10,2) NOT NULL,
  `max_salary` decimal(10,2) NOT NULL,
  PRIMARY KEY  (`grade`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of grade
-- ----------------------------
INSERT INTO `grade` VALUES ('1', '0.00', '3000.00');
INSERT INTO `grade` VALUES ('2', '3001.00', '4500.00');
INSERT INTO `grade` VALUES ('3', '4501.00', '6000.00');
INSERT INTO `grade` VALUES ('4', '6501.00', '8000.00');
INSERT INTO `grade` VALUES ('7', '8001.00', '20000.00');
