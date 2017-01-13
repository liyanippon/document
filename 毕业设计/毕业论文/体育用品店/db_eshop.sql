/*
MySQL Data Transfer
Source Host: localhost
Source Database: db_eshop
Target Host: localhost
Target Database: db_eshop
Date: 2014/3/30 12:30:57
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for admin
-- ----------------------------
CREATE TABLE `admin` (
  `ID` int(4) NOT NULL AUTO_INCREMENT,
  `AdminType` int(4) DEFAULT NULL,
  `AdminName` char(12) DEFAULT NULL,
  `LoginName` char(12) DEFAULT NULL,
  `LoginPwd` char(12) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Table structure for cart
-- ----------------------------
CREATE TABLE `cart` (
  `ID` int(4) NOT NULL AUTO_INCREMENT,
  `Member` int(4) NOT NULL,
  `Money` decimal(9,2) DEFAULT NULL,
  `CartStatus` int(4) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Table structure for cartselectedmer
-- ----------------------------
CREATE TABLE `cartselectedmer` (
  `ID` int(4) NOT NULL AUTO_INCREMENT,
  `Cart` int(4) NOT NULL,
  `Merchandise` int(4) NOT NULL,
  `Number` int(4) NOT NULL DEFAULT '1',
  `Price` decimal(8,2) NOT NULL DEFAULT '0.00',
  `Money` decimal(9,2) NOT NULL DEFAULT '0.00',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Table structure for category
-- ----------------------------
CREATE TABLE `category` (
  `ID` int(4) NOT NULL AUTO_INCREMENT,
  `CateName` char(40) DEFAULT NULL,
  `CateDesc` mediumtext,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Table structure for leaveword
-- ----------------------------
CREATE TABLE `leaveword` (
  `ID` int(4) NOT NULL AUTO_INCREMENT,
  `Member` int(4) NOT NULL,
  `Admin` int(4) DEFAULT NULL,
  `Title` char(60) DEFAULT NULL,
  `Content` mediumtext,
  `LeaveDate` datetime DEFAULT NULL,
  `AnswerContent` mediumtext,
  `AnswerDate` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `Admin` (`Admin`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Table structure for member
-- ----------------------------
CREATE TABLE `member` (
  `ID` int(4) NOT NULL AUTO_INCREMENT,
  `Memberlevel` int(4) NOT NULL,
  `LoginName` char(12) DEFAULT NULL,
  `LoginPwd` char(12) DEFAULT NULL,
  `MemberName` char(20) DEFAULT NULL,
  `Phone` char(15) DEFAULT NULL,
  `Address` varchar(100) DEFAULT NULL,
  `Zip` char(10) DEFAULT NULL,
  `RegDate` datetime DEFAULT NULL,
  `LastDate` datetime DEFAULT NULL,
  `LoginTimes` int(4) DEFAULT NULL,
  `EMail` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Table structure for memberlevel
-- ----------------------------
CREATE TABLE `memberlevel` (
  `ID` int(4) NOT NULL AUTO_INCREMENT,
  `LevelName` char(20) DEFAULT NULL,
  `Favourable` int(4) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Table structure for merchandise
-- ----------------------------
CREATE TABLE `merchandise` (
  `ID` int(4) NOT NULL AUTO_INCREMENT,
  `Category` int(4) NOT NULL,
  `MerName` char(40) DEFAULT NULL,
  `Price` decimal(8,2) DEFAULT NULL,
  `SPrice` decimal(8,2) DEFAULT NULL,
  `MerModel` char(40) DEFAULT NULL,
  `Picture` varchar(100) DEFAULT NULL,
  `MerDesc` text,
  `Manufacturer` char(60) DEFAULT NULL,
  `LeaveFactoryDate` datetime DEFAULT NULL,
  `Special` int(4) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Table structure for orders
-- ----------------------------
CREATE TABLE `orders` (
  `ID` int(4) NOT NULL AUTO_INCREMENT,
  `Member` int(4) NOT NULL,
  `Cart` int(4) NOT NULL,
  `OrderNO` char(20) DEFAULT NULL,
  `OrderDate` datetime DEFAULT NULL,
  `OrderStatus` int(4) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `admin` VALUES ('1', '1', '商品管理员', 'merman', 'merman');
INSERT INTO `admin` VALUES ('2', '2', '订单管理员', 'orderman', 'orderman');
INSERT INTO `admin` VALUES ('3', '3', '会员管理员', 'memberman', 'memberman');
INSERT INTO `admin` VALUES ('4', '4', '系统用户管理员', 'sys', 'sys');
INSERT INTO `admin` VALUES ('5', '1', '商品管理员1', 'merman1', 'merman1');
INSERT INTO `cart` VALUES ('5', '2', '1299.00', '0');
INSERT INTO `cart` VALUES ('6', '6', '719.00', '1');
INSERT INTO `cart` VALUES ('7', '6', '1056.00', '1');
INSERT INTO `cartselectedmer` VALUES ('7', '5', '11', '1', '1100.00', '1100.00');
INSERT INTO `cartselectedmer` VALUES ('8', '6', '17', '1', '110.00', '110.00');
INSERT INTO `cartselectedmer` VALUES ('9', '6', '15', '1', '120.00', '120.00');
INSERT INTO `cartselectedmer` VALUES ('10', '6', '16', '1', '399.00', '399.00');
INSERT INTO `cartselectedmer` VALUES ('11', '7', '16', '2', '399.00', '798.00');
INSERT INTO `cartselectedmer` VALUES ('12', '7', '18', '1', '57.00', '57.00');
INSERT INTO `category` VALUES ('6', '足球类', '足球类');
INSERT INTO `category` VALUES ('7', '篮球类', '篮球类');
INSERT INTO `category` VALUES ('8', '羽毛球类', '羽毛球类');
INSERT INTO `category` VALUES ('9', '兵兵球类', '兵兵球类');
INSERT INTO `category` VALUES ('10', '网球类', '网球类');
INSERT INTO `category` VALUES ('11', '护具', '护具');
INSERT INTO `category` VALUES ('12', '其他', '其他');
INSERT INTO `leaveword` VALUES ('5', '6', null, '11', '11', '2014-03-30 12:26:49', null, null);
INSERT INTO `member` VALUES ('1', '2', 'aa', 'aa', 'aa', '15820354509', 'jyu', '514015', '2011-03-12 14:47:57', '2011-03-12 14:48:04', '1', '11@qq.com');
INSERT INTO `member` VALUES ('2', '1', 'zhou', 'zhou', '周生', '15820354509', '广东信宜', '525330', '2011-04-05 21:54:05', '2011-05-21 11:06:10', '15', 'zhhaojie@yahoo.cn');
INSERT INTO `member` VALUES ('3', '1', 'zhhaojie', '111', '周浩杰', '15820354509', '广东省信宜', '525338', '2011-05-19 10:08:25', '2011-05-19 10:08:25', '0', '1111@qq.com');
INSERT INTO `member` VALUES ('4', '2', 'zhhaojie', '111', '周浩杰', '15820354509', '广东省信宜', '525338', '2011-05-19 10:08:34', '2011-05-19 10:08:34', '0', '1111@qq.com');
INSERT INTO `member` VALUES ('5', '1', 'xihua', '123', '熊西华', '15820354509', '广东梅州', '525330', '2011-05-19 10:22:15', '2011-05-19 10:22:15', '0', '212121@qq.com');
INSERT INTO `member` VALUES ('6', '1', 'a', 'a', 'aa', '11111111111', '11', '1111', '2014-03-30 12:12:34', '2014-03-30 12:26:00', '2', '');
INSERT INTO `member` VALUES ('7', '1', 'a', 'a', 'aa', '11111111111', '11', '1111', '2014-03-30 12:12:53', '2014-03-30 12:12:53', '0', '');
INSERT INTO `memberlevel` VALUES ('1', '普通会员', '95');
INSERT INTO `memberlevel` VALUES ('2', '中级会员', '90');
INSERT INTO `memberlevel` VALUES ('3', '高级会员', '85');
INSERT INTO `memberlevel` VALUES ('4', 'VIP会员', '80');
INSERT INTO `merchandise` VALUES ('14', '9', '红双喜乒乓球拍X碳素5星', '200.00', '180.00', 'X5', '/Picture/4.jpg', '红双喜乒乓球拍X碳素5星', '红双喜', '2014-03-04 00:00:00', '1');
INSERT INTO `merchandise` VALUES ('15', '6', '世达5号高级合成皮足球SB475-04', '200.00', '120.00', 'SB475-04', '/Picture/3.jpg', '世达5号高级合成皮足球SB475-04', '世达', '2014-03-04 00:00:00', '1');
INSERT INTO `merchandise` VALUES ('16', '8', '李宁AYPE134-2全碳素UC3720羽拍', '600.00', '399.00', 'AYPE134-2', '/Picture/2.jpg', '李宁AYPE134-2全碳素UC3720羽拍', '李宁', '2014-01-08 00:00:00', '1');
INSERT INTO `merchandise` VALUES ('17', '7', '斯伯丁PU室外室内篮球74-105', '200.00', '110.00', '74-105', '/Picture/1.jpg', '斯伯丁PU室外室内篮球74-105', '斯伯丁', '2014-03-05 00:00:00', '0');
INSERT INTO `merchandise` VALUES ('18', '11', '世达膝关节护套XD310W-01白色', '60.00', '0.00', 'XD310W-01', '/Picture/1147_P_1325141022158.jpg', '世达膝关节护套XD310W-01白色', '世达', '2014-03-05 00:00:00', '0');
INSERT INTO `merchandise` VALUES ('19', '6', 'Wilson威尔胜WRT3245002 初学者碳铝合金网球拍', '400.00', '0.00', 'WRT3245002', '/Picture/1190_P_1325225597128.jpg', 'Wilson威尔胜WRT3245002 初学者碳铝合金网球拍', 'Wilson', '2014-03-12 00:00:00', '0');
INSERT INTO `merchandise` VALUES ('20', '12', '世达STAR沙滩排球SUMMERLY-HS CB315-31', '300.00', '0.00', 'CB315-31', '/Picture/1198_P_1325668818043.jpg', '世达STAR沙滩排球SUMMERLY-HS CB315-31', '世达', '2014-03-06 00:00:00', '0');
INSERT INTO `orders` VALUES ('5', '6', '6', '1396152810205', '2014-03-30 12:13:30', '1');
INSERT INTO `orders` VALUES ('6', '6', '7', '1396153590878', '2014-03-30 12:26:30', '3');
