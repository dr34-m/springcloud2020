/*
 Navicat Premium Data Transfer

 Source Server         : springcloud2020
 Source Server Type    : MySQL
 Source Server Version : 50648
 Source Host           : 101.132.181.16:3306
 Source Schema         : springcloud2020

 Target Server Type    : MySQL
 Target Server Version : 50648
 File Encoding         : 65001

 Date: 05/11/2021 16:42:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for payment
-- ----------------------------
DROP TABLE IF EXISTS `payment`;
CREATE TABLE `payment`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `serial` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of payment
-- ----------------------------
INSERT INTO `payment` VALUES (1, '啦啦啦');
INSERT INTO `payment` VALUES (2, '999');

SET FOREIGN_KEY_CHECKS = 1;
