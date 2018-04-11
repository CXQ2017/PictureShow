/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.5.40 : Database - hospital
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hospital` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `hospital`;

/*Table structure for table `bingchengjilu` */

DROP TABLE IF EXISTS `bingchengjilu`;

CREATE TABLE `bingchengjilu` (
  `bc_id` int(11) NOT NULL COMMENT '主键',
  `department` varchar(50) DEFAULT NULL COMMENT '科室',
  `bed_no` varchar(50) DEFAULT NULL COMMENT '床号',
  `card_medical` varchar(50) DEFAULT NULL COMMENT '住院号/病案号',
  `case_Trait` text COMMENT '病例特点',
  `diagnostic_procedure` text COMMENT '诊断、诊断依据及鉴别诊断',
  `diagnostic_plan` text COMMENT '诊疗计划',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `create_date` date DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`bc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `bingchengjilu` */

/*Table structure for table `chafangjilu` */

DROP TABLE IF EXISTS `chafangjilu`;

CREATE TABLE `chafangjilu` (
  `id` int(11) NOT NULL COMMENT '主键',
  `card_medical` varchar(50) DEFAULT NULL COMMENT '住院号/病案号',
  `bc_id` int(11) DEFAULT NULL COMMENT '病程记录表的主键',
  `Patient_rounds_date` date DEFAULT NULL COMMENT '查房时间',
  `Patient_rounds_doctor` varchar(50) DEFAULT NULL COMMENT '查房医师',
  `Patient_rounds_details` text COMMENT '查房详情记录',
  `doctor_signature` varchar(50) DEFAULT NULL COMMENT '医师签名',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `create_date` date DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `chafangjilu` */

/*Table structure for table `dischargerecord` */

DROP TABLE IF EXISTS `dischargerecord`;

CREATE TABLE `dischargerecord` (
  `id` int(11) DEFAULT NULL COMMENT '主键',
  `department` varchar(50) DEFAULT NULL COMMENT '科室',
  `bed_no` varchar(50) DEFAULT NULL COMMENT '床号',
  `record_date` date DEFAULT NULL COMMENT '记录日期',
  `card_medical` varchar(50) DEFAULT NULL COMMENT '住院号/病案号',
  `admission_date` date DEFAULT NULL COMMENT '入院日期',
  `discharge_date` date DEFAULT NULL COMMENT '出院日期',
  `admitting_situation` text COMMENT '入院情况',
  `admitting_diagnosis` text COMMENT '入院诊断',
  `treatment_process` text COMMENT '诊疗经过',
  `discharge_diagnosis` text COMMENT '出院诊断',
  `discharge_situation` text COMMENT '出院情况',
  `discharge_advice` text COMMENT '出院医嘱',
  `physician_signature` varchar(50) DEFAULT NULL COMMENT '医师签名',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `create_date` date DEFAULT NULL COMMENT '创建时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `dischargerecord` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
