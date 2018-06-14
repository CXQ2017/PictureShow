package com.cxq.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Administrator on 2018/4/11/011.
 *
 * 住院首页  uniqueConstraints = {@UniqueConstraint(columnNames="keyword")}
 */
@Entity
@Table(name = "medical_record")
public class MedicalRecord {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String sex;
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date birthday; //'出生日期',
    private Integer age; //'年龄',
    private String nationality; // '国籍',
    private String volk; // '民族',
    private String homeplace_province; // '出生省' 备注：出生省改为出生地，存放出生地信息，出生市和出生县弃用。
    private String homeplace_city; // '出生市',
    private String homeplace_county;// '出生县',
    private String pay_way; // '付费方式',
    private String card_health; // '健康卡号',

    private Integer times_hospitalized; // '住院次数',
    @JoinColumn(name = "card_medical")
    private String card_medical; // '病案号',
    private String native_place;// '籍贯',
    private String card_id; // '身份证号',
    private String vocation; // '职业',
    private String marriage; // '婚姻状况',
    private String present_address; // '现住址',
    private String phone; //'电话',
    private String address_code; // '现住址邮编',
    private String residence; // '户口',
    private String residence_code; // '户口邮编',
    private String work_unit_address; //` '工作单位及地址',
    private String work_unit_phone; //` '单位电话',
    private String work_unit_code; //` '单位邮编',
    private String linkman_name; //`  '联系人姓名',
    private String linkman_relation; //` '联系人关系',
    private String linkman_address; //` '联系人地址',
    private String linkman_phone; //`  '联系人电话',
    private String hospitalized_road; //` '入院途径',
    private String patient_source; //`  '病人来源',
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date hospitalized_day; //` '入院日期',                         //
    private String hospitalized_category; //` '入院科别',
    private String hospitalized_ward; //` '入院病房',
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date change_time;    //'转科时间',                              //
    private String change_ward;    // '转科科别',

    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date leave_hospital_day;  // '出院日期',                      //
    private String leave_hospital_category;   // '出院科别',
    private String leave_hospital_ward;   // '出院病房',
    private String real_hospitalization_day;   // '实际住院天数',
    private String clinic_diagnosis;     // '门（急）诊诊断',
    private String disease_coding;    // '疾病编码',
    private String outpatient_doctor;   // '门诊医生',
    private String main_diagnosis;   // '出院主要诊断',
    private String main_disease_coding;       //'主要诊断疾病编码',
    private String main_diagnosis_state;   // '入院主要诊断病情',
    @Column(columnDefinition="TEXT")
    private String other_diagnosis;   // '其他出院诊断',
    private String other_diagnosis_coding;   // '其他诊断疾病编码',
    private String other_diagnosis_state;      // '其它诊断入院情况',
    private String case_classification;   // '病例分型',
    private String clinical_pathway_cases;     // '临床路径病例',
    private String rescue_times;     // '抢救次数',
    private String success_times;      // '成功次数',
    private String external_causes;        //'损伤、中毒的外部原因',
    private String external_causes_coding;       // '损伤中毒的外部因素编码',
    private String pathologic_diagnosis;    //'病理诊断',
    private String pathological_number;    /// '病理号',
    private String pathologic_diagnosis_coding;     // '病理诊断编码',
    private String outpatient_discharge_accord;     //'门诊与出院诊断符合情况',
    private String clinical_pathological;      // '临床与病理诊断符合情况',
    private String drug_allergy;            //'是否过敏',
    private String drug_allergy_name;    //'过敏药物名称',
    private String autopsy;     //'死亡患者是否尸检',
    private String blood_type;      //'ABO血型',
    private String Rh;       ///Rh血型',
    private String head_department;     // '科主任',
    private String protomedicus;     /// '主（副）任医师',
    private String visiting_staff;    // '主治医师',
    private String resident;       // '住院医师',
    private String primary_nurse;    //'责任护士',
    private String refresher_physician;    //'进修医师',
    private String intern;   //'实习医师',
    private String coder;   // '编码员',
    private String medical_record_quality;   //'病案质量',
    private String quality_control_physician;   // '质控医师',
    private String quality_control_nurse;  // '质控护士',
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date quality_control_date;  // '质控日期',

    private Integer status; // '状态',0---未完成（默认），1---审核通过，2---审核未通过，3----待审核
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss" )
    private Date create_time; //'创建时间',

    //唯一标识

    private String keyword;

    public MedicalRecord(){
        this.status=0;
        this.create_time=new Date();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getVolk() {
        return volk;
    }

    public void setVolk(String volk) {
        this.volk = volk;
    }

    public String getHomeplace_province() {
        return homeplace_province;
    }

    public void setHomeplace_province(String homeplace_province) {
        this.homeplace_province = homeplace_province;
    }

    public String getHomeplace_city() {
        return homeplace_city;
    }

    public void setHomeplace_city(String homeplace_city) {
        this.homeplace_city = homeplace_city;
    }

    public String getHomeplace_county() {
        return homeplace_county;
    }

    public void setHomeplace_county(String homeplace_county) {
        this.homeplace_county = homeplace_county;
    }

    public String getPay_way() {
        return pay_way;
    }

    public void setPay_way(String pay_way) {
        this.pay_way = pay_way;
    }

    public String getCard_health() {
        return card_health;
    }

    public void setCard_health(String card_health) {
        this.card_health = card_health;
    }

    public Integer getTimes_hospitalized() {
        return times_hospitalized;
    }

    public void setTimes_hospitalized(Integer times_hospitalized) {
        this.times_hospitalized = times_hospitalized;
    }

    public String getCard_medical() {
        return card_medical;
    }

    public void setCard_medical(String card_medical) {
        this.card_medical = card_medical;
    }

    public String getNative_place() {
        return native_place;
    }

    public void setNative_place(String native_place) {
        this.native_place = native_place;
    }

    public String getCard_id() {
        return card_id;
    }

    public void setCard_id(String card_id) {
        this.card_id = card_id;
    }

    public String getVocation() {
        return vocation;
    }

    public void setVocation(String vocation) {
        this.vocation = vocation;
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    public String getPresent_address() {
        return present_address;
    }

    public void setPresent_address(String present_address) {
        this.present_address = present_address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress_code() {
        return address_code;
    }

    public void setAddress_code(String address_code) {
        this.address_code = address_code;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getResidence_code() {
        return residence_code;
    }

    public void setResidence_code(String residence_code) {
        this.residence_code = residence_code;
    }

    public String getWork_unit_address() {
        return work_unit_address;
    }

    public void setWork_unit_address(String work_unit_address) {
        this.work_unit_address = work_unit_address;
    }

    public String getWork_unit_phone() {
        return work_unit_phone;
    }

    public void setWork_unit_phone(String work_unit_phone) {
        this.work_unit_phone = work_unit_phone;
    }

    public String getWork_unit_code() {
        return work_unit_code;
    }

    public void setWork_unit_code(String work_unit_code) {
        this.work_unit_code = work_unit_code;
    }

    public String getLinkman_name() {
        return linkman_name;
    }

    public void setLinkman_name(String linkman_name) {
        this.linkman_name = linkman_name;
    }

    public String getLinkman_relation() {
        return linkman_relation;
    }

    public void setLinkman_relation(String linkman_relation) {
        this.linkman_relation = linkman_relation;
    }

    public String getLinkman_address() {
        return linkman_address;
    }

    public void setLinkman_address(String linkman_address) {
        this.linkman_address = linkman_address;
    }

    public String getLinkman_phone() {
        return linkman_phone;
    }

    public void setLinkman_phone(String linkman_phone) {
        this.linkman_phone = linkman_phone;
    }

    public String getHospitalized_road() {
        return hospitalized_road;
    }

    public void setHospitalized_road(String hospitalized_road) {
        this.hospitalized_road = hospitalized_road;
    }

    public String getPatient_source() {
        return patient_source;
    }

    public void setPatient_source(String patient_source) {
        this.patient_source = patient_source;
    }

    public Date getHospitalized_day() {
        return hospitalized_day;
    }

    public void setHospitalized_day(Date hospitalized_day) {
        this.hospitalized_day = hospitalized_day;
    }

    public String getHospitalized_category() {
        return hospitalized_category;
    }

    public void setHospitalized_category(String hospitalized_category) {
        this.hospitalized_category = hospitalized_category;
    }

    public String getHospitalized_ward() {
        return hospitalized_ward;
    }

    public void setHospitalized_ward(String hospitalized_ward) {
        this.hospitalized_ward = hospitalized_ward;
    }

    public Date getChange_time() {
        return change_time;
    }

    public void setChange_time(Date change_time) {
        this.change_time = change_time;
    }

    public String getChange_ward() {
        return change_ward;
    }

    public void setChange_ward(String change_ward) {
        this.change_ward = change_ward;
    }

    public Date getLeave_hospital_day() {
        return leave_hospital_day;
    }

    public void setLeave_hospital_day(Date leave_hospital_day) {
        this.leave_hospital_day = leave_hospital_day;
    }

    public String getLeave_hospital_category() {
        return leave_hospital_category;
    }

    public void setLeave_hospital_category(String leave_hospital_category) {
        this.leave_hospital_category = leave_hospital_category;
    }

    public String getLeave_hospital_ward() {
        return leave_hospital_ward;
    }

    public void setLeave_hospital_ward(String leave_hospital_ward) {
        this.leave_hospital_ward = leave_hospital_ward;
    }

    public String getReal_hospitalization_day() {
        return real_hospitalization_day;
    }

    public void setReal_hospitalization_day(String real_hospitalization_day) {
        this.real_hospitalization_day = real_hospitalization_day;
    }

    public String getClinic_diagnosis() {
        return clinic_diagnosis;
    }

    public void setClinic_diagnosis(String clinic_diagnosis) {
        this.clinic_diagnosis = clinic_diagnosis;
    }

    public String getDisease_coding() {
        return disease_coding;
    }

    public void setDisease_coding(String disease_coding) {
        this.disease_coding = disease_coding;
    }

    public String getOutpatient_doctor() {
        return outpatient_doctor;
    }

    public void setOutpatient_doctor(String outpatient_doctor) {
        this.outpatient_doctor = outpatient_doctor;
    }

    public String getMain_diagnosis() {
        return main_diagnosis;
    }

    public void setMain_diagnosis(String main_diagnosis) {
        this.main_diagnosis = main_diagnosis;
    }

    public String getMain_disease_coding() {
        return main_disease_coding;
    }

    public void setMain_disease_coding(String main_disease_coding) {
        this.main_disease_coding = main_disease_coding;
    }

    public String getMain_diagnosis_state() {
        return main_diagnosis_state;
    }

    public void setMain_diagnosis_state(String main_diagnosis_state) {
        this.main_diagnosis_state = main_diagnosis_state;
    }

    public String getOther_diagnosis() {
        return other_diagnosis;
    }

    public void setOther_diagnosis(String other_diagnosis) {
        this.other_diagnosis = other_diagnosis;
    }

    public String getOther_diagnosis_coding() {
        return other_diagnosis_coding;
    }

    public void setOther_diagnosis_coding(String other_diagnosis_coding) {
        this.other_diagnosis_coding = other_diagnosis_coding;
    }

    public String getOther_diagnosis_state() {
        return other_diagnosis_state;
    }

    public void setOther_diagnosis_state(String other_diagnosis_state) {
        this.other_diagnosis_state = other_diagnosis_state;
    }

    public String getCase_classification() {
        return case_classification;
    }

    public void setCase_classification(String case_classification) {
        this.case_classification = case_classification;
    }

    public String getClinical_pathway_cases() {
        return clinical_pathway_cases;
    }

    public void setClinical_pathway_cases(String clinical_pathway_cases) {
        this.clinical_pathway_cases = clinical_pathway_cases;
    }

    public String getRescue_times() {
        return rescue_times;
    }

    public void setRescue_times(String rescue_times) {
        this.rescue_times = rescue_times;
    }

    public String getSuccess_times() {
        return success_times;
    }

    public void setSuccess_times(String success_times) {
        this.success_times = success_times;
    }

    public String getExternal_causes() {
        return external_causes;
    }

    public void setExternal_causes(String external_causes) {
        this.external_causes = external_causes;
    }

    public String getExternal_causes_coding() {
        return external_causes_coding;
    }

    public void setExternal_causes_coding(String external_causes_coding) {
        this.external_causes_coding = external_causes_coding;
    }

    public String getPathologic_diagnosis() {
        return pathologic_diagnosis;
    }

    public void setPathologic_diagnosis(String pathologic_diagnosis) {
        this.pathologic_diagnosis = pathologic_diagnosis;
    }

    public String getPathological_number() {
        return pathological_number;
    }

    public void setPathological_number(String pathological_number) {
        this.pathological_number = pathological_number;
    }

    public String getPathologic_diagnosis_coding() {
        return pathologic_diagnosis_coding;
    }

    public void setPathologic_diagnosis_coding(String pathologic_diagnosis_coding) {
        this.pathologic_diagnosis_coding = pathologic_diagnosis_coding;
    }

    public String getOutpatient_discharge_accord() {
        return outpatient_discharge_accord;
    }

    public void setOutpatient_discharge_accord(String outpatient_discharge_accord) {
        this.outpatient_discharge_accord = outpatient_discharge_accord;
    }

    public String getClinical_pathological() {
        return clinical_pathological;
    }

    public void setClinical_pathological(String clinical_pathological) {
        this.clinical_pathological = clinical_pathological;
    }

    public String getDrug_allergy() {
        return drug_allergy;
    }

    public void setDrug_allergy(String drug_allergy) {
        this.drug_allergy = drug_allergy;
    }

    public String getDrug_allergy_name() {
        return drug_allergy_name;
    }

    public void setDrug_allergy_name(String drug_allergy_name) {
        this.drug_allergy_name = drug_allergy_name;
    }

    public String getAutopsy() {
        return autopsy;
    }

    public void setAutopsy(String autopsy) {
        this.autopsy = autopsy;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }

    public String getRh() {
        return Rh;
    }

    public void setRh(String rh) {
        Rh = rh;
    }

    public String getHead_department() {
        return head_department;
    }

    public void setHead_department(String head_department) {
        this.head_department = head_department;
    }

    public String getProtomedicus() {
        return protomedicus;
    }

    public void setProtomedicus(String protomedicus) {
        this.protomedicus = protomedicus;
    }

    public String getVisiting_staff() {
        return visiting_staff;
    }

    public void setVisiting_staff(String visiting_staff) {
        this.visiting_staff = visiting_staff;
    }

    public String getResident() {
        return resident;
    }

    public void setResident(String resident) {
        this.resident = resident;
    }

    public String getPrimary_nurse() {
        return primary_nurse;
    }

    public void setPrimary_nurse(String primary_nurse) {
        this.primary_nurse = primary_nurse;
    }

    public String getRefresher_physician() {
        return refresher_physician;
    }

    public void setRefresher_physician(String refresher_physician) {
        this.refresher_physician = refresher_physician;
    }

    public String getIntern() {
        return intern;
    }

    public void setIntern(String intern) {
        this.intern = intern;
    }

    public String getCoder() {
        return coder;
    }

    public void setCoder(String coder) {
        this.coder = coder;
    }

    public String getMedical_record_quality() {
        return medical_record_quality;
    }

    public void setMedical_record_quality(String medical_record_quality) {
        this.medical_record_quality = medical_record_quality;
    }

    public String getQuality_control_physician() {
        return quality_control_physician;
    }

    public void setQuality_control_physician(String quality_control_physician) {
        this.quality_control_physician = quality_control_physician;
    }

    public String getQuality_control_nurse() {
        return quality_control_nurse;
    }

    public void setQuality_control_nurse(String quality_control_nurse) {
        this.quality_control_nurse = quality_control_nurse;
    }

    public Date getQuality_control_date() {
        return quality_control_date;
    }

    public void setQuality_control_date(Date quality_control_date) {
        this.quality_control_date = quality_control_date;
    }

    public Integer getStatu() {
        return status;
    }

    public void setStatu(Integer statu) {
        this.status = statu;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}
