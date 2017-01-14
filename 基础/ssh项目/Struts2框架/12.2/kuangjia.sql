/*
Navicat MariaDB Data Transfer

Source Server         : localhost_3306
Source Server Version : 100014
Source Host           : localhost:3306
Source Database       : db1

Target Server Type    : MariaDB
Target Server Version : 100014
File Encoding         : 65001

Date: 2009-12-02 18:24:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` varchar(255) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', 'admin', '1234');
