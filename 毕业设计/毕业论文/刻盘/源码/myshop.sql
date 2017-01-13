/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50157
Source Host           : localhost:3306
Source Database       : myshop

Target Server Type    : MYSQL
Target Server Version : 50157
File Encoding         : 65001

Date: 2014-11-05 17:18:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_admin
-- ----------------------------
DROP TABLE IF EXISTS `t_admin`;
CREATE TABLE `t_admin` (
  `userId` int(11) NOT NULL,
  `userName` varchar(50) DEFAULT NULL,
  `userPw` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_admin
-- ----------------------------
INSERT INTO `t_admin` VALUES ('1', 'admin', 'admin');

-- ----------------------------
-- Table structure for t_catelog
-- ----------------------------
DROP TABLE IF EXISTS `t_catelog`;
CREATE TABLE `t_catelog` (
  `catelog_id` int(11) NOT NULL,
  `catelog_name` varchar(50) DEFAULT NULL,
  `catelog_del` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`catelog_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_catelog
-- ----------------------------
INSERT INTO `t_catelog` VALUES ('2', '篮球/足球/排球', 'no');
INSERT INTO `t_catelog` VALUES ('3', '羽毛球', 'no');
INSERT INTO `t_catelog` VALUES ('4', '乒乓球', 'no');
INSERT INTO `t_catelog` VALUES ('5', '网球', 'no');
INSERT INTO `t_catelog` VALUES ('6', '健身器械', 'no');
INSERT INTO `t_catelog` VALUES ('7', '运动器材', 'no');
INSERT INTO `t_catelog` VALUES ('8', '骑行运动', 'no');
INSERT INTO `t_catelog` VALUES ('9', '运动服饰', 'no');
INSERT INTO `t_catelog` VALUES ('10', '运动鞋袜', 'no');
INSERT INTO `t_catelog` VALUES ('11', '运动护具', 'no');

-- ----------------------------
-- Table structure for t_gonggao
-- ----------------------------
DROP TABLE IF EXISTS `t_gonggao`;
CREATE TABLE `t_gonggao` (
  `gonggao_id` int(11) NOT NULL,
  `gonggao_title` varchar(50) DEFAULT NULL,
  `gonggao_content` text,
  `gonggao_data` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`gonggao_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_gonggao
-- ----------------------------
INSERT INTO `t_gonggao` VALUES ('1', '测试公告测试公告测试公告测试公告测试公告', '测试公告测试公告测试公告测试公告测试公告', '2015-03-31 13:18');
INSERT INTO `t_gonggao` VALUES ('2', '333333333333333333333333333333333333', '333333333333333333333333333333333333', '2015-03-31 13:18');

-- ----------------------------
-- Table structure for t_goods
-- ----------------------------
DROP TABLE IF EXISTS `t_goods`;
CREATE TABLE `t_goods` (
  `goods_id` int(11) NOT NULL,
  `goods_name` varchar(50) DEFAULT NULL,
  `goods_miaoshu` text,
  `goods_pic` varchar(50) DEFAULT NULL,
  `goods_ISBN` varchar(50) DEFAULT NULL,
  `goods_shichangjia` int(11) DEFAULT NULL,
  `goods_tejia` int(11) DEFAULT NULL,
  `goods_isnottejia` varchar(50) DEFAULT NULL,
  `goods_isnottuijian` varchar(50) DEFAULT NULL,
  `goods_catelog_id` int(11) DEFAULT NULL,
  `goods_kucun` int(11) DEFAULT NULL,
  `goods_Del` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_goods
-- ----------------------------
INSERT INTO `t_goods` VALUES ('1', '家用跑步机', '家用跑步机，亿健(YIJIAN)多功能家用电动跑步机', '/upload/1415175658282.jpg', '亿健', '3911', '3911', 'no', 'no', '6', '-1', 'no');
INSERT INTO `t_goods` VALUES ('2', '艾威家用健身车', '艾威家用健身车', '/upload/1415175718690.jpg', '艾威', '980', '980', 'no', 'no', '7', '-1', 'no');
INSERT INTO `t_goods` VALUES ('3', '多功能踏步机', '多功能踏步机', '/upload/1415175929889.jpg', '诚悦', '570', '550', 'yes', 'no', '7', '0', 'no');
INSERT INTO `t_goods` VALUES ('4', '艾威家用磁控椭圆机', '艾威家用磁控椭圆机', '/upload/1415175975916.jpg', '艾威', '2233', '2000', 'yes', 'no', '7', '0', 'no');
INSERT INTO `t_goods` VALUES ('5', '匹克篮球鞋', '匹克篮球鞋', '/upload/1415176111569.jpg', '匹克', '396', '396', 'no', 'no', '10', '0', 'no');
INSERT INTO `t_goods` VALUES ('6', '李宁足球鞋', '李宁足球鞋', '/upload/1415176159653.jpg', '李宁', '299', '250', 'yes', 'no', '10', '-1', 'no');
INSERT INTO `t_goods` VALUES ('7', '户外徒步登山鞋', '户外徒步登山鞋', '/upload/1415176231939.jpg', '骆驼', '299', '258', 'yes', 'no', '10', '0', 'no');
INSERT INTO `t_goods` VALUES ('8', '喜力高足球服套装', '喜力高足球服套装', '/upload/1415176324147.jpg', '喜力高', '285', '280', 'yes', 'no', '9', '0', 'no');
INSERT INTO `t_goods` VALUES ('9', '双节棍', '请输入内容', '/upload/1415176734684.jpg', '世达', '119', '119', 'no', 'no', '6', '-1', 'no');
INSERT INTO `t_goods` VALUES ('10', '滑板', '滑板', '/upload/1415176785395.jpg', '喜力高', '98', '98', 'no', 'no', '8', '-1', 'no');
INSERT INTO `t_goods` VALUES ('11', '李宁篮球服套装', '李宁篮球服套装', '/upload/1415176930975.jpg', '李宁', '392', '392', 'no', 'no', '9', '-1', 'no');
INSERT INTO `t_goods` VALUES ('12', '舒美丽姿臂力器', '舒美丽姿臂力器', '/upload/1415177007493.jpg', '舒美丽', '98', '98', 'no', 'no', '6', '0', 'no');
INSERT INTO `t_goods` VALUES ('13', '世达(STAR )足球', '世达(STAR )足球', '/upload/1415177101877.jpg', '世达', '149', '149', 'no', 'no', '2', '-1', 'no');
INSERT INTO `t_goods` VALUES ('14', '耐克跑步鞋', '耐克跑步鞋', '/upload/1415177150042.jpg', '耐克', '379', '379', 'no', 'no', '10', '-1', 'no');
INSERT INTO `t_goods` VALUES ('15', '诚悦哑铃', '诚悦哑铃', '/upload/1415177295330.jpg', '诚悦', '300', '300', 'no', 'no', '6', '0', 'no');
INSERT INTO `t_goods` VALUES ('16', '斯伯丁篮球', '斯伯丁篮球', '/upload/1415177397046.jpg', '斯伯丁', '98', '98', 'no', 'no', '2', '-1', 'no');
INSERT INTO `t_goods` VALUES ('17', '胜利羽毛球拍', '胜利羽毛球拍', '/upload/1415177438774.jpg', '胜利', '199', '199', 'no', 'no', '3', '-1', 'no');
INSERT INTO `t_goods` VALUES ('18', '网球拍', '世达网球拍', '/upload/1415177610408.jpg', '世达', '99', '99', 'no', 'no', '5', '0', 'no');
INSERT INTO `t_goods` VALUES ('19', '兵乓球拍组套', '兵乓球拍组套', '/upload/1415177656451.jpg', '萨达', '119', '119', 'no', 'no', '4', '-1', 'no');
INSERT INTO `t_goods` VALUES ('20', '排球', '<p>世达排球</p>', '/upload/1415177731066.jpg', '世达', '197', '197', 'no', 'no', '2', '0', 'no');

-- ----------------------------
-- Table structure for t_liuyan
-- ----------------------------
DROP TABLE IF EXISTS `t_liuyan`;
CREATE TABLE `t_liuyan` (
  `liuyan_id` int(11) NOT NULL,
  `liuyan_title` varchar(50) DEFAULT NULL,
  `liuyan_content` text,
  `liuyan_date` varchar(50) DEFAULT NULL,
  `liuyan_user` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`liuyan_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_liuyan
-- ----------------------------
INSERT INTO `t_liuyan` VALUES ('1', 'dfffffffff', '请输入内容ffffddddddd', '2013-3-31 2:27:20', 'liusan');

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order` (
  `order_id` int(11) NOT NULL,
  `order_bianhao` varchar(50) DEFAULT NULL,
  `order_date` varchar(50) DEFAULT NULL,
  `order_zhuangtai` varchar(50) DEFAULT NULL,
  `order_songhuodizhi` varchar(50) DEFAULT NULL,
  `order_fukuangfangshi` varchar(50) DEFAULT NULL,
  `order_jine` int(11) DEFAULT NULL,
  `order_user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_order
-- ----------------------------
INSERT INTO `t_order` VALUES ('1', '20141105045745', '2014-11-05 04:57:45', 'no', '大学城', '货到付款', '5407', '8');
INSERT INTO `t_order` VALUES ('2', '20141105050425', '2014-11-05 05:04:25', 'no', '大学城', '货到付款', '1336', '8');

-- ----------------------------
-- Table structure for t_orderitem
-- ----------------------------
DROP TABLE IF EXISTS `t_orderitem`;
CREATE TABLE `t_orderitem` (
  `orderItem_id` int(11) NOT NULL,
  `order_id` int(11) DEFAULT NULL,
  `goods_id` int(11) DEFAULT NULL,
  `goods_quantity` int(11) DEFAULT NULL,
  PRIMARY KEY (`orderItem_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_orderitem
-- ----------------------------
INSERT INTO `t_orderitem` VALUES ('1', '1', '1', '1');
INSERT INTO `t_orderitem` VALUES ('2', '1', '2', '1');
INSERT INTO `t_orderitem` VALUES ('3', '1', '6', '1');
INSERT INTO `t_orderitem` VALUES ('4', '1', '9', '1');
INSERT INTO `t_orderitem` VALUES ('5', '1', '10', '1');
INSERT INTO `t_orderitem` VALUES ('6', '2', '17', '1');
INSERT INTO `t_orderitem` VALUES ('7', '2', '16', '1');
INSERT INTO `t_orderitem` VALUES ('8', '2', '19', '1');
INSERT INTO `t_orderitem` VALUES ('9', '2', '11', '1');
INSERT INTO `t_orderitem` VALUES ('10', '2', '13', '1');
INSERT INTO `t_orderitem` VALUES ('11', '2', '14', '1');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `user_id` int(11) NOT NULL,
  `user_name` varchar(50) DEFAULT NULL,
  `user_pw` varchar(50) DEFAULT NULL,
  `user_realname` varchar(50) DEFAULT NULL,
  `user_sex` varchar(50) DEFAULT NULL,
  `user_age` varchar(50) DEFAULT NULL,
  `user_address` varchar(255) DEFAULT NULL,
  `user_tel` varchar(50) DEFAULT NULL,
  `user_email` varchar(50) DEFAULT NULL,
  `user_del` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('7', 'liusan', '000000', '刘三', '女', '21', '北京路', '13555555555', 'liusan@yahoo.cn', 'no');
INSERT INTO `t_user` VALUES ('8', 'kitty', '111111', '张三', '男', '21', '上海路', '13222221111', 'liusdsfdfn@yahoo.cn', 'no');
INSERT INTO `t_user` VALUES ('9', 'hello', '123132', '张五', '男', '22', '北京东路', '13512231211', 'sdfsdfn@yahoo.cn', 'no');
INSERT INTO `t_user` VALUES ('10', 'szzzzz', '111222', '王二', '女', '19', '天津路', '13574112312', 'ldgh@yahoo.cn', 'no');
INSERT INTO `t_user` VALUES ('11', 'wang', '321332', '王大', '男', '20', '云南路', '13123441111', '4556an@yahoo.cn', 'no');
INSERT INTO `t_user` VALUES ('12', 'lihong', 'sdfdf', '王三', '女', '22', '北京西路', '13574112355', 'ldg3h@yahoo.cn', 'no');
INSERT INTO `t_user` VALUES ('13', '23132', '2344554', '李四', '男', '23', '北京东路', '13978988787', 'ldgh@yahoo.cn', 'no');
