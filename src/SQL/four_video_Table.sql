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

/*Table structure for table `heart_rate_chart` */

DROP TABLE IF EXISTS `heart_rate_chart`;

CREATE TABLE `heart_rate_chart` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pr_interphase` varchar(255) DEFAULT NULL COMMENT 'PR间期',
  `p_r_t` varchar(255) DEFAULT NULL COMMENT 'P_R_T轴',
  `qrs_width` varchar(255) DEFAULT NULL COMMENT 'QRS宽度',
  `qt` varchar(255) DEFAULT NULL COMMENT 'QT',
  `bed_no` varchar(255) DEFAULT NULL COMMENT '床号',
  `card_medical` varchar(255) DEFAULT NULL COMMENT '病案号、住院号',
  `create_date` datetime DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL COMMENT '科室',
  `sinus_rhythm` varchar(255) DEFAULT NULL COMMENT '窦性心律',
  `status` int(11) DEFAULT NULL,
  `ventricular_rate` varchar(255) DEFAULT NULL COMMENT '心室率',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `heart_rate_chart` */

/*Table structure for table `transcranial_doppler_report` */

DROP TABLE IF EXISTS `transcranial_doppler_report`;

CREATE TABLE `transcranial_doppler_report` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `tcd_conclusion` varchar(255) DEFAULT NULL COMMENT 'TCD结论',
  `tcd_content` varchar(255) DEFAULT NULL COMMENT 'TCD描述',
  `bed_no` varchar(255) DEFAULT NULL COMMENT '床号',
  `card_medical` varchar(255) DEFAULT NULL COMMENT '病案号、住院号',
  `check_number` varchar(255) DEFAULT NULL COMMENT '检查号',
  `check_time` datetime DEFAULT NULL COMMENT '检查时间',
  `create_date` datetime DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL COMMENT '科室',
  `physician_signature` varchar(255) DEFAULT NULL COMMENT '医师签名',
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `transcranial_doppler_report` */

/*Table structure for table `ultrasonic_diagnosis_report` */

DROP TABLE IF EXISTS `ultrasonic_diagnosis_report`;

CREATE TABLE `ultrasonic_diagnosis_report` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `bed_no` varchar(255) DEFAULT NULL COMMENT '床号',
  `card_medical` varchar(255) DEFAULT NULL COMMENT '病案号、住院号',
  `check_equipment` varchar(255) DEFAULT NULL COMMENT '检查设备',
  `consultant_doctor` varchar(255) DEFAULT NULL COMMENT '会诊医师',
  `create_date` datetime DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL COMMENT '科室',
  `diagnosis_doctor` varchar(255) DEFAULT NULL COMMENT '诊断医师',
  `inspection_area` varchar(255) DEFAULT NULL COMMENT '检查部位',
  `print_date` varchar(255) DEFAULT NULL COMMENT '打印日期',
  `report_date` varchar(255) DEFAULT NULL COMMENT '报告日期',
  `status` int(11) DEFAULT NULL,
  `ultrasonic_content` varchar(255) DEFAULT NULL COMMENT '超声所见',
  `ultrasonic_number` varchar(255) DEFAULT NULL COMMENT '超声波号',
  `ultrasonic_tip` varchar(255) DEFAULT NULL COMMENT '超声提示',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `ultrasonic_diagnosis_report` */

/*Table structure for table `video_report` */

DROP TABLE IF EXISTS `video_report`;

CREATE TABLE `video_report` (
  `vr_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `bed_no` varchar(255) DEFAULT NULL COMMENT '床号',
  `card_medical` varchar(255) DEFAULT NULL COMMENT '病案号、住院号',
  `check_doctor` varchar(255) DEFAULT NULL COMMENT '审核医师',
  `create_time` datetime DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL COMMENT '科室',
  `eclarationd_num` varchar(255) DEFAULT NULL COMMENT '申报单号',
  `final_check_doctor` varchar(255) DEFAULT NULL COMMENT '终审医师',
  `inspection_area` varchar(255) DEFAULT NULL COMMENT '检查部位',
  `patient_id` int(11) DEFAULT NULL COMMENT '病人id',
  `report_time` datetime DEFAULT NULL COMMENT '报告日期',
  `reported_doctor` varchar(255) DEFAULT NULL COMMENT '报告医师',
  `status` int(11) DEFAULT NULL,
  `video_conclusion` varchar(255) DEFAULT NULL COMMENT '影像学意见',
  `video_content` varchar(255) DEFAULT NULL COMMENT '影像学所见',
  `video_status` int(11) DEFAULT NULL COMMENT '影像类别：1--影像科MR检查报告书; 2--影像科CT检查报告书；3--影像科X检查报告',
  PRIMARY KEY (`vr_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `video_report` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
