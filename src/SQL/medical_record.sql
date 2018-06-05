/*
Navicat MySQL Data Transfer

Source Server         : MyWeb
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : zdby

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2018-04-10 17:29:45
*/
/*病案首页表 */;
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for medical_record
-- ----------------------------
DROP TABLE IF EXISTS `medical_record`;
CREATE TABLE `medical_record` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `birthday` date DEFAULT NULL COMMENT '出生日期',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `nationality` varchar(255) DEFAULT NULL COMMENT '国籍',
  `volk` varchar(255) DEFAULT NULL COMMENT '民族',
  `homeplace_province` varchar(255) DEFAULT NULL COMMENT '出生省',
  `homeplace_city` varchar(255) DEFAULT NULL COMMENT '出生市',
  `homeplace_county` varchar(255) DEFAULT NULL COMMENT '出生县',
  `pay_way` varchar(255) DEFAULT NULL COMMENT '付费方式',
  `card_health` varchar(255) DEFAULT NULL COMMENT '健康卡号',
  `times_hospitalized` int(11) DEFAULT NULL COMMENT '住院次数',
  `card_medical` varchar(255) NOT NULL COMMENT '病案号',
  `native_place` varchar(255) DEFAULT NULL COMMENT '籍贯',
  `card_id` int(11) DEFAULT NULL COMMENT '身份证号',
  `vocation` varchar(255) DEFAULT NULL COMMENT '职业',
  `marriage` varchar(255) DEFAULT NULL COMMENT '婚姻状况',
  `present_address` varchar(255) DEFAULT NULL COMMENT '现住址',
  `phone` varchar(255) DEFAULT NULL COMMENT '电话',
  `address_code` varchar(255) DEFAULT NULL COMMENT '现住址邮编',
  `residence` varchar(255) DEFAULT NULL COMMENT '户口',
  `residence_code` varchar(255) DEFAULT NULL COMMENT '户口邮编',
  ` work_unit_address` varchar(255) DEFAULT NULL COMMENT '工作单位及地址',
  ` work_unit_phone` varchar(255) DEFAULT NULL COMMENT '单位电话',
  ` work_unit_code` varchar(255) DEFAULT NULL COMMENT '单位邮编',
  `linkman_name` varchar(255) DEFAULT NULL COMMENT '联系人姓名',
  `linkman_relation` varchar(255) DEFAULT NULL COMMENT '联系人关系',
  `linkman_address` varchar(255) DEFAULT NULL COMMENT '联系人地址',
  `linkman_phone` varchar(255) DEFAULT NULL COMMENT '联系人电话',
  `hospitalized_road` varchar(255) DEFAULT NULL COMMENT '入院途径',
  `patient_source` varchar(255) DEFAULT NULL COMMENT '病人来源',
  `hospitalized_day` date DEFAULT NULL COMMENT '入院日期',
  `hospitalized_category` varchar(255) DEFAULT NULL COMMENT '入院科别',
  `hospitalized_ward` varchar(255) DEFAULT NULL COMMENT '入院病房',
  `change_time` datetime DEFAULT NULL COMMENT '转科时间',
  `change_ward` varchar(255) DEFAULT NULL COMMENT '转科科别',
  `leave_hospital_day` date DEFAULT NULL COMMENT '出院日期',
  `leave_hospital_category` varchar(255) DEFAULT NULL COMMENT '出院科别',
  `leave_hospital_ward` varchar(255) DEFAULT NULL COMMENT '出院病房',
  `real_hospitalization_day` varchar(255) DEFAULT NULL COMMENT '实际住院天数',
  `clinic_diagnosis` varchar(255) DEFAULT NULL COMMENT '门（急）诊诊断',
  `disease_coding` varchar(255) DEFAULT NULL COMMENT '疾病编码',
  `outpatient_doctor` varchar(255) DEFAULT NULL COMMENT '门诊医生',
  `main_diagnosis` varchar(255) DEFAULT NULL COMMENT '出院主要诊断',
  `main_disease_coding` varchar(255) DEFAULT NULL COMMENT '主要诊断疾病编码',
  `main_diagnosis_state` varchar(255) DEFAULT NULL COMMENT '入院主要诊断病情',
  `other_diagnosis` varchar(255) DEFAULT NULL COMMENT '其他出院诊断',
  `other_diagnosis_coding` varchar(255) DEFAULT NULL COMMENT '其他诊断疾病编码',
  `other_diagnosis_state` varchar(255) DEFAULT NULL COMMENT '其它诊断入院情况',
  `case_classification` varchar(255) DEFAULT NULL COMMENT '病例分型',
  `clinical_pathway_cases` varchar(255) DEFAULT NULL COMMENT '临床路径病例',
  `rescue_times` varchar(255) DEFAULT NULL COMMENT '抢救次数',
  `success_times` varchar(255) DEFAULT NULL COMMENT '成功次数',
  `external_causes` text COMMENT '损伤、中毒的外部原因',
  `external_causes_coding` varchar(255) DEFAULT NULL COMMENT '损伤中毒的外部因素编码',
  `pathologic_diagnosis` text COMMENT '病理诊断',
  `pathological_number` varchar(255) DEFAULT NULL COMMENT '病理号',
  `pathologic_diagnosis_coding` varchar(255) DEFAULT NULL COMMENT '病理诊断编码',
  `outpatient_discharge_accord` varchar(255) DEFAULT NULL COMMENT '门诊与出院诊断符合情况',
  `clinical_pathological` varchar(255) DEFAULT NULL COMMENT '临床与病理诊断符合情况',
  `drug_allergy` varchar(255) DEFAULT NULL COMMENT '是否过敏',
  `drug_allergy_name` varchar(255) DEFAULT NULL COMMENT '过敏药物名称',
  `autopsy` varchar(255) DEFAULT NULL COMMENT '死亡患者是否尸检',
  `blood_type` varchar(255) DEFAULT NULL COMMENT 'ABO血型',
  `Rh` varchar(255) DEFAULT NULL COMMENT 'Rh血型',
  `head_department` varchar(255) DEFAULT NULL COMMENT '科主任',
  `protomedicus` varchar(255) DEFAULT NULL COMMENT '主（副）任医师',
  `visiting_staff` varchar(255) DEFAULT NULL COMMENT '主治医师',
  `resident` varchar(255) DEFAULT NULL COMMENT '住院医师',
  `primary_nurse` varchar(255) DEFAULT NULL COMMENT '责任护士',
  `refresher_physician` varchar(255) DEFAULT NULL COMMENT '进修医师',
  `intern` varchar(255) DEFAULT NULL COMMENT '实习医师',
  `coder` varchar(255) DEFAULT NULL COMMENT '编码员',
  `medical_record_quality` varchar(255) DEFAULT NULL COMMENT '病案质量',
  `quality_control_physician` varchar(255) DEFAULT NULL COMMENT '质控医师',
  `quality_control_nurse` varchar(255) DEFAULT NULL COMMENT '质控护士',
  `quality_control_date` date DEFAULT NULL COMMENT '质控日期',
  `statu` varchar(255) DEFAULT NULL COMMENT '状态',
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of medical_record
-- ----------------------------
