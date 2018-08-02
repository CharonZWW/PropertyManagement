/*
Navicat MySQL Data Transfer

Source Server         : rds
Source Server Version : 50721
Source Host           : rds-sq-first.cxz4bl3jclhi.ap-northeast-2.rds.amazonaws.com:3306
Source Database       : property_mangement

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-07-26 19:39:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for Account
-- ----------------------------
DROP TABLE IF EXISTS `Account`;
CREATE TABLE `Account` (
  `a_id` int(11) NOT NULL AUTO_INCREMENT,
  `a_h_id` int(11) DEFAULT NULL,
  `a_phoneNumber` varchar(11) NOT NULL,
  `a_password` varchar(20) NOT NULL,
  PRIMARY KEY (`a_id`),
  KEY `FK_account_house_hid` (`a_h_id`),
  CONSTRAINT `FK_account_house_hid` FOREIGN KEY (`a_h_id`) REFERENCES `house` (`h_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of Account
-- ----------------------------

-- ----------------------------
-- Table structure for advice
-- ----------------------------
DROP TABLE IF EXISTS `advice`;
CREATE TABLE `advice` (
  `advice_id` int(11) NOT NULL AUTO_INCREMENT,
  `advice_a_id` int(11) NOT NULL,
  `advice_content` varchar(500) NOT NULL,
  `advice_time` timestamp NOT NULL,
  PRIMARY KEY (`advice_id`),
  KEY `FK_advice_account_aid` (`advice_a_id`),
  CONSTRAINT `FK_advice_account_aid` FOREIGN KEY (`advice_a_id`) REFERENCES `Account` (`a_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of advice
-- ----------------------------

-- ----------------------------
-- Table structure for Community_Vehicle
-- ----------------------------
DROP TABLE IF EXISTS `Community_Vehicle`;
CREATE TABLE `Community_Vehicle` (
  `cv_plateNumber` varchar(10) NOT NULL,
  `cv_garage_number` int(11) DEFAULT NULL,
  `cv_expireDate` date NOT NULL,
  PRIMARY KEY (`cv_plateNumber`),
  KEY `FK_communityVehicle_parkingPlace_plateNumber` (`cv_garage_number`),
  CONSTRAINT `FK_communityVehicle_parkingPlace_plateNumber` FOREIGN KEY (`cv_garage_number`) REFERENCES `garage` (`garage_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of Community_Vehicle
-- ----------------------------

-- ----------------------------
-- Table structure for complain
-- ----------------------------
DROP TABLE IF EXISTS `complain`;
CREATE TABLE `complain` (
  `comlain_id` int(11) NOT NULL AUTO_INCREMENT,
  `complain_a_id` int(11) NOT NULL,
  `complain_m_id` int(11) DEFAULT NULL,
  `complain_content` varchar(500) NOT NULL,
  `complain_id` timestamp NOT NULL,
  `complain_status` varchar(10) NOT NULL,
  PRIMARY KEY (`comlain_id`),
  KEY `FK_complain_account_aid` (`complain_a_id`),
  KEY `FK_complain_manager_mid` (`complain_m_id`),
  CONSTRAINT `FK_complain_account_aid` FOREIGN KEY (`complain_a_id`) REFERENCES `Account` (`a_id`),
  CONSTRAINT `FK_complain_manager_mid` FOREIGN KEY (`complain_m_id`) REFERENCES `Managers` (`m_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of complain
-- ----------------------------

-- ----------------------------
-- Table structure for fee_factors
-- ----------------------------
DROP TABLE IF EXISTS `fee_factors`;
CREATE TABLE `fee_factors` (
  `fp_id` int(11) NOT NULL,
  `fp_fee_type` varchar(10) NOT NULL,
  `fp_fee_factor` double NOT NULL,
  PRIMARY KEY (`fp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fee_factors
-- ----------------------------

-- ----------------------------
-- Table structure for garage
-- ----------------------------
DROP TABLE IF EXISTS `garage`;
CREATE TABLE `garage` (
  `garage_number` int(11) NOT NULL,
  `garage_h_id` int(11) DEFAULT NULL,
  `garage_status` varchar(10) DEFAULT NULL,
  `garage_manageFeeExpireDate` date DEFAULT NULL,
  PRIMARY KEY (`garage_number`),
  KEY `FK_garage_house_hid` (`garage_h_id`),
  CONSTRAINT `FK_garage_house_hid` FOREIGN KEY (`garage_h_id`) REFERENCES `house` (`h_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of garage
-- ----------------------------

-- ----------------------------
-- Table structure for garage_manage_fee_payment
-- ----------------------------
DROP TABLE IF EXISTS `garage_manage_fee_payment`;
CREATE TABLE `garage_manage_fee_payment` (
  `gmfp_id` int(11) NOT NULL AUTO_INCREMENT,
  `gmfp_garage_number` int(11) NOT NULL,
  `gmfp_month` int(11) NOT NULL,
  `gmfp_time` timestamp NOT NULL,
  `gmfp_amount` double NOT NULL,
  PRIMARY KEY (`gmfp_id`),
  KEY `FK_garage_plate_number` (`gmfp_garage_number`),
  CONSTRAINT `FK_garage_plate_number` FOREIGN KEY (`gmfp_garage_number`) REFERENCES `garage` (`garage_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of garage_manage_fee_payment
-- ----------------------------

-- ----------------------------
-- Table structure for house
-- ----------------------------
DROP TABLE IF EXISTS `house`;
CREATE TABLE `house` (
  `h_id` int(11) NOT NULL AUTO_INCREMENT,
  `h_buildingNumber` int(11) NOT NULL,
  `h_unitNumber` int(11) NOT NULL,
  `h_roomNumber` int(11) NOT NULL,
  `h_holderName` varchar(20) DEFAULT NULL,
  `h_contactNumber` varchar(11) DEFAULT NULL,
  `h_area` double NOT NULL,
  `h_waterFee` double DEFAULT '0',
  `h_propertyFeeExpirationDate` date DEFAULT NULL,
  PRIMARY KEY (`h_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of house
-- ----------------------------
INSERT INTO `house` VALUES ('1', '1', '1', '101', '宋大傻', '10101010101', '123', '133', '2018-10-18');

-- ----------------------------
-- Table structure for information
-- ----------------------------
DROP TABLE IF EXISTS `information`;
CREATE TABLE `information` (
  `info_id` int(11) NOT NULL AUTO_INCREMENT,
  `info_a_id` int(11) NOT NULL,
  `info_m_id` int(11) DEFAULT NULL,
  `info_type` varchar(10) NOT NULL,
  `info_content` varchar(500) NOT NULL,
  PRIMARY KEY (`info_id`),
  KEY `FK_info_manager_mid` (`info_m_id`),
  KEY `FK_infomation_account_aid` (`info_a_id`),
  CONSTRAINT `FK_info_manager_mid` FOREIGN KEY (`info_m_id`) REFERENCES `Managers` (`m_id`),
  CONSTRAINT `FK_infomation_account_aid` FOREIGN KEY (`info_a_id`) REFERENCES `Account` (`a_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of information
-- ----------------------------

-- ----------------------------
-- Table structure for inside_vehicle
-- ----------------------------
DROP TABLE IF EXISTS `inside_vehicle`;
CREATE TABLE `inside_vehicle` (
  `iv_plateNumber` varchar(10) NOT NULL,
  `iv_entry_time` timestamp NOT NULL,
  `iv_type` varchar(10) NOT NULL,
  PRIMARY KEY (`iv_plateNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of inside_vehicle
-- ----------------------------

-- ----------------------------
-- Table structure for Managers
-- ----------------------------
DROP TABLE IF EXISTS `Managers`;
CREATE TABLE `Managers` (
  `m_id` int(11) NOT NULL AUTO_INCREMENT,
  `m_role_id` int(11) DEFAULT NULL,
  `m_username` varchar(20) NOT NULL,
  `m_password` varchar(20) NOT NULL,
  PRIMARY KEY (`m_id`),
  KEY `FK_manger_role_rid` (`m_role_id`),
  CONSTRAINT `FK_manger_role_rid` FOREIGN KEY (`m_role_id`) REFERENCES `role` (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of Managers
-- ----------------------------
INSERT INTO `Managers` VALUES ('1', '1', 'admin', 'admin');

-- ----------------------------
-- Table structure for notification
-- ----------------------------
DROP TABLE IF EXISTS `notification`;
CREATE TABLE `notification` (
  `noti_id` int(11) NOT NULL AUTO_INCREMENT,
  `noti_m_id` int(11) NOT NULL,
  `noti_type` varchar(20) NOT NULL,
  `noti_content` varchar(500) NOT NULL,
  `noti_time` timestamp NOT NULL,
  PRIMARY KEY (`noti_id`),
  KEY `FK_notice_manager_mid` (`noti_m_id`),
  CONSTRAINT `FK_notice_manager_mid` FOREIGN KEY (`noti_m_id`) REFERENCES `Managers` (`m_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of notification
-- ----------------------------

-- ----------------------------
-- Table structure for parking_month_rent_fee
-- ----------------------------
DROP TABLE IF EXISTS `parking_month_rent_fee`;
CREATE TABLE `parking_month_rent_fee` (
  `pmrf_id` int(11) NOT NULL AUTO_INCREMENT,
  `pmrf_plateNumber` varchar(10) NOT NULL,
  `pmrf_month` int(11) NOT NULL,
  `pmrf_amount` double NOT NULL,
  PRIMARY KEY (`pmrf_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of parking_month_rent_fee
-- ----------------------------

-- ----------------------------
-- Table structure for property_fee_payment_records
-- ----------------------------
DROP TABLE IF EXISTS `property_fee_payment_records`;
CREATE TABLE `property_fee_payment_records` (
  `pf_id` int(11) NOT NULL AUTO_INCREMENT,
  `pf_h_id` int(11) NOT NULL,
  `pf_months` int(11) NOT NULL,
  `pf_timestamp` date NOT NULL,
  `pf_amount` double NOT NULL,
  PRIMARY KEY (`pf_id`),
  KEY `FK_propertyFee_house_hid` (`pf_h_id`),
  CONSTRAINT `FK_propertyFee_house_hid` FOREIGN KEY (`pf_h_id`) REFERENCES `house` (`h_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of property_fee_payment_records
-- ----------------------------

-- ----------------------------
-- Table structure for repair_request
-- ----------------------------
DROP TABLE IF EXISTS `repair_request`;
CREATE TABLE `repair_request` (
  `repair_id` int(11) NOT NULL AUTO_INCREMENT,
  `repair_h_id` int(11) NOT NULL,
  `repair_m_id` int(11) DEFAULT NULL,
  `repair_type` varchar(10) NOT NULL,
  `repair_problem_describe` varchar(500) NOT NULL,
  `repair_request_time` timestamp NOT NULL,
  `repair_response_time` timestamp NULL DEFAULT NULL,
  `repair_complete_time` timestamp NULL DEFAULT NULL,
  `repair_status` varchar(10) NOT NULL,
  PRIMARY KEY (`repair_id`),
  KEY `FK_repair_house_hid` (`repair_h_id`),
  KEY `FK_repair_manager_mid` (`repair_m_id`),
  CONSTRAINT `FK_repair_house_hid` FOREIGN KEY (`repair_h_id`) REFERENCES `house` (`h_id`),
  CONSTRAINT `FK_repair_manager_mid` FOREIGN KEY (`repair_m_id`) REFERENCES `Managers` (`m_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of repair_request
-- ----------------------------

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(10) NOT NULL,
  `role_authority` int(11) NOT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '管理者', '1');

-- ----------------------------
-- Table structure for temporary_parking_fee
-- ----------------------------
DROP TABLE IF EXISTS `temporary_parking_fee`;
CREATE TABLE `temporary_parking_fee` (
  `tpf_id` int(11) NOT NULL AUTO_INCREMENT,
  `tpf_plateNumber` varchar(10) NOT NULL,
  `tpf_entry_time` timestamp NOT NULL,
  `tpf_exit_time` timestamp NOT NULL,
  `tpf_fee` int(11) NOT NULL,
  PRIMARY KEY (`tpf_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of temporary_parking_fee
-- ----------------------------

-- ----------------------------
-- Table structure for vehicle_parking_record
-- ----------------------------
DROP TABLE IF EXISTS `vehicle_parking_record`;
CREATE TABLE `vehicle_parking_record` (
  `vpr_id` int(11) NOT NULL AUTO_INCREMENT,
  `vpr_entry_time` timestamp NOT NULL,
  `vpr_exit_time` timestamp NOT NULL,
  `vpr_plate_number` varchar(10) NOT NULL,
  PRIMARY KEY (`vpr_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of vehicle_parking_record
-- ----------------------------

-- ----------------------------
-- Table structure for visitors
-- ----------------------------
DROP TABLE IF EXISTS `visitors`;
CREATE TABLE `visitors` (
  `visitor_id` int(11) NOT NULL AUTO_INCREMENT,
  `visitor_h_id` int(11) DEFAULT NULL,
  `visitor_m_id` int(11) DEFAULT NULL,
  `visitor_record_time` timestamp NOT NULL,
  `visitor_name` varchar(20) NOT NULL,
  `visitor_id_type` varchar(10) DEFAULT NULL,
  `visitor_id_number` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`visitor_id`),
  KEY `FK_visitor_house_hid` (`visitor_h_id`),
  KEY `FK_visitor_manager_mid` (`visitor_m_id`),
  CONSTRAINT `FK_visitor_house_hid` FOREIGN KEY (`visitor_h_id`) REFERENCES `house` (`h_id`),
  CONSTRAINT `FK_visitor_manager_mid` FOREIGN KEY (`visitor_m_id`) REFERENCES `Managers` (`m_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of visitors
-- ----------------------------

-- ----------------------------
-- Table structure for water_fee_payment
-- ----------------------------
DROP TABLE IF EXISTS `water_fee_payment`;
CREATE TABLE `water_fee_payment` (
  `wf_id` int(11) NOT NULL AUTO_INCREMENT,
  `wf_h_id` int(11) NOT NULL,
  `wf_amount` double NOT NULL,
  `wf_time` timestamp NOT NULL,
  PRIMARY KEY (`wf_id`),
  KEY `FK_wfp_house_hid` (`wf_h_id`),
  CONSTRAINT `FK_wfp_house_hid` FOREIGN KEY (`wf_h_id`) REFERENCES `house` (`h_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of water_fee_payment
-- ----------------------------
