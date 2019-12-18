/*
MySQL Data Transfer
Source Host: localhost
Source Database: mybatis
Target Host: localhost
Target Database: mybatis
Date: 2019/12/18 9:51:34
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for tbl_employee
-- ----------------------------
CREATE TABLE `tbl_employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `last_name` varchar(255) DEFAULT NULL,
  `gender` char(1) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `tbl_employee` VALUES ('1', 'tom', '0', '123@QQ.COM');
