/*
 Navicat Premium Data Transfer

 Source Server         : test
 Source Server Type    : MySQL
 Source Server Version : 50621
 Source Host           : localhost:3306
 Source Schema         : jteam03_springboot_demo

 Target Server Type    : MySQL
 Target Server Version : 50621
 File Encoding         : 65001

 Date: 15/04/2021 15:48:32
*/
drop database if exists aucmall; -- 数据库名不能用中划线-
create database aucmall;
use aucmall;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for browsing_history
-- ----------------------------
DROP TABLE IF EXISTS `browsing_history`;
CREATE TABLE `browsing_history`  (
                                     `id` int(11) NOT NULL AUTO_INCREMENT,
                                     `user_id` int(200) NOT NULL,
                                     `merch_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                                     `merch_id` int(200) NOT NULL,
                                     `time` timestamp(0) NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP(0),
                                     `is_deleted` tinyint(1) NOT NULL,
                                     PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 223 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`  (
                            `id` int(11) NOT NULL AUTO_INCREMENT,
                            `order_id` int(11) NULL DEFAULT NULL,
                            `comment` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                            `is_deleted` tinyint(1) NOT NULL,
                            `img` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                            `stars` int(11) NOT NULL,
                            PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 56 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for coupon
-- ----------------------------
DROP TABLE IF EXISTS `coupon`;
CREATE TABLE `coupon`  (
                           `id` int(11) NOT NULL AUTO_INCREMENT,
                           `user_id` int(11) NULL DEFAULT NULL,
                           `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                           `discount` int(10) NOT NULL,
                           `status` tinyint(1) NOT NULL,
                           `is_deleted` tinyint(1) NOT NULL,
                           PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for mall_orders
-- ----------------------------
DROP TABLE IF EXISTS `mall_orders`;
CREATE TABLE `mall_orders`  (
                                `id` int(11) NOT NULL AUTO_INCREMENT,
                                `merch_id` int(11) NULL DEFAULT NULL,
                                `comment_id` int(11) NULL DEFAULT NULL,
                                `owner_id` int(100) NOT NULL,
                                `buyer_id` int(11) NULL DEFAULT NULL,
                                `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                                `status` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                                `deal_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
                                `deal_price` int(11) NOT NULL,
                                `is_canceled` tinyint(1) NOT NULL,
                                `is_delivered` tinyint(1) NOT NULL,
                                `is_received` tinyint(1) NOT NULL,
                                `is_deleted` tinyint(1) NOT NULL,
                                PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 23 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for merchandise
-- ----------------------------
DROP TABLE IF EXISTS `merchandise`;
CREATE TABLE `merchandise`  (
                                `id` int(11) NOT NULL AUTO_INCREMENT,
                                `img` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                                `user_id` int(11) NULL DEFAULT NULL,
                                `order_id` int(11) NULL DEFAULT NULL,
                                `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                                `mark` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                                `description` varchar(400) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                                `kind` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                                `added_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
                                `start_time` timestamp(0) NOT NULL DEFAULT '0000-00-00 00:00:00',
                                `stop_time` timestamp(0) NOT NULL DEFAULT '0000-00-00 00:00:00',
                                `open_auction` tinyint(1) NOT NULL,
                                `reserve_price` int(11) NOT NULL,
                                `on_sale` tinyint(1) NOT NULL,
                                `have_highest_price` tinyint(1) NOT NULL,
                                `highest_price` int(11) NULL DEFAULT NULL,
                                `current_bid_price` int(11) NULL DEFAULT NULL,
                                `status` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                                `least_each_price_increase` int(11) NOT NULL,
                                `is_deleted` tinyint(1) NOT NULL,
                                PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 55 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for shipping_address
-- ----------------------------
DROP TABLE IF EXISTS `shipping_address`;
CREATE TABLE `shipping_address`  (
                                     `id` int(11) NOT NULL AUTO_INCREMENT,
                                     `user_id` int(11) NULL DEFAULT NULL,
                                     `address` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                                     `is_default` tinyint(1) NOT NULL,
                                     `is_deleted` tinyint(1) NOT NULL,
                                     PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
                         `id` int(11) NOT NULL AUTO_INCREMENT,
                         `mail` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                         `password` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                         `nickname` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                         `sex` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                         `reward_point` int(11) UNSIGNED NOT NULL,
                         `balance` int(11) NOT NULL,
                         `is_deleted` tinyint(1) NOT NULL,
                         PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
