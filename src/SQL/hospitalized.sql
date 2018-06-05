/*
Navicat MySQL Data Transfer

Source Server         : MyWeb
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : zdby

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2018-04-11 15:28:45
*/
/*!入院记录 */;
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for hospitalized
-- ----------------------------
DROP TABLE IF EXISTS `hospitalized`;
CREATE TABLE `hospitalized` (
  `id` int(11) NOT NULL,
  `card_medical` varchar(255) DEFAULT NULL COMMENT '病案号',
  `record_day` date DEFAULT NULL COMMENT '记录日期',
  `history_statement` varchar(255) DEFAULT NULL COMMENT '病史陈述者',
  `main_suit` varchar(255) DEFAULT NULL COMMENT '入院主诉',
  `present_illness_history` text COMMENT '现病史',
  `anamnesis` text COMMENT '既往史',
  `personal_history` text COMMENT '个人史',
  `obsterical_history` text COMMENT '婚育史',
  `family_history` text COMMENT '家族史',
  `temperature` varchar(255) DEFAULT NULL COMMENT '体格检查体温',
  `pulse` varchar(255) DEFAULT NULL COMMENT '脉搏',
  `breathe` varchar(255) DEFAULT NULL COMMENT '呼吸',
  `blood_pressure` varchar(255) DEFAULT NULL COMMENT '血压',
  `weight` double DEFAULT NULL COMMENT '体重',
  `general_condition` text COMMENT '一般情况',
  `skin_mucosa` text COMMENT '皮肤黏膜',
  `lymphaden` text COMMENT '淋巴结',
  `head` text COMMENT '头部',
  `neck` text COMMENT '颈部',
  `chest` text COMMENT '胸部',
  `belly` text COMMENT '腹部',
  `anal_genitalia` text COMMENT '肛门生殖器',
  `spine` text COMMENT '脊柱四肢',
  `reflex` text COMMENT '神经生理行反射',
  `special_case` text COMMENT '专科情况',
  `accessory` text COMMENT '辅助检查',
  `modified_diagnosis` text COMMENT '修正诊断',
  `modified_diagnosis_name` varchar(0) DEFAULT NULL COMMENT '修正诊断签名',
  `modified_diagnosis_day` date DEFAULT NULL COMMENT '修正诊断日期',
  `tentative_diagnosis` text COMMENT '初步诊断',
  `tentative_diagnosis_name` varchar(255) DEFAULT NULL COMMENT '初步诊断签名',
  `tentative_diagnosis_day` date DEFAULT NULL COMMENT '初步诊断日期',
  `supplementary_diagnosis` text COMMENT '补充诊断',
  `supplementary_diagnosis_name` varchar(255) DEFAULT NULL COMMENT '补充诊断签名',
  `supplementary_diagnosis_day` date DEFAULT NULL COMMENT '补充诊断日期',
  `final_diagnosis` text COMMENT '最后诊断',
  `final_diagnosis_name` varchar(255) DEFAULT NULL COMMENT '最后诊断签名',
  `final_diagnosis_day` date DEFAULT NULL COMMENT '最后诊断日期',
  `status` varchar(255) DEFAULT NULL COMMENT '状态',
  `create_time` date DEFAULT NULL COMMENT '创建日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hospitalized
-- ----------------------------
