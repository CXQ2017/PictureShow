package com.cxq.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Administrator on 2018/4/11 0011.
 *
 *
 */
@Entity
@Table(name = "hospitalized")
public class Hospitalized {
    @Id
    @GeneratedValue
    private Integer id;
    private String card_medical;  //病案号
    private Date record_day;//记录日期
    private String history_statement;//病史陈述者
    private String main_suit;//入院主诉
    private String present_illness_history;//现病史
    private String anamnesis;//既往史
    private String personal_history;//个人史
    private String obsterical_history;//婚育史
    private String family_history;//家族史
    private String temperature;//体格检查体温
    private String pulse;//脉搏
    private String breathe;//呼吸
    private String blood_pressure;//血压
    private Double weight;//体重
    private String general_condition;//一般情况
    private String skin_mucosa;//皮肤黏膜
    private String lymphaden;//淋巴结
    private String head;//头部
    private String neck;//颈部
    private String chest;//胸部
    private String belly;//腹部
    private String anal_genitalia;//肛门生殖器
    private String spine;//脊柱四肢
    private String reflex;//神经生理行反射
    private String special_case;//专科情况
    private String accessory;//辅助检查
    private String modified_diagnosis;//修正诊断
    private String modified_diagnosis_name;//修正诊断签名
    private Date modified_diagnosis_day;//修正诊断日期
    private String tentative_diagnosis;//初步诊断
    private String tentative_diagnosis_name;//初步诊断签名
    private Date tentative_diagnosis_day;//初步诊断日期
    private String supplementary_diagnosis;//补充诊断
    private String supplementary_diagnosis_name;//补充诊断签名
    private Date supplementary_diagnosis_day;//补充诊断日期
    private String final_diagnosis;//最后诊断
    private String final_diagnosis_name;//最后诊断签名
    private Date final_diagnosis_day;//最后诊断日期
    private String status;//状态
    private Date create_time;//创建日期

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCard_medical() {
        return card_medical;
    }

    public void setCard_medical(String card_medical) {
        this.card_medical = card_medical;
    }

    public Date getRecord_day() {
        return record_day;
    }

    public void setRecord_day(Date record_day) {
        this.record_day = record_day;
    }

    public String getHistory_statement() {
        return history_statement;
    }

    public void setHistory_statement(String history_statement) {
        this.history_statement = history_statement;
    }

    public String getMain_suit() {
        return main_suit;
    }

    public void setMain_suit(String main_suit) {
        this.main_suit = main_suit;
    }

    public String getPresent_illness_history() {
        return present_illness_history;
    }

    public void setPresent_illness_history(String present_illness_history) {
        this.present_illness_history = present_illness_history;
    }

    public String getAnamnesis() {
        return anamnesis;
    }

    public void setAnamnesis(String anamnesis) {
        this.anamnesis = anamnesis;
    }

    public String getPersonal_history() {
        return personal_history;
    }

    public void setPersonal_history(String personal_history) {
        this.personal_history = personal_history;
    }

    public String getObsterical_history() {
        return obsterical_history;
    }

    public void setObsterical_history(String obsterical_history) {
        this.obsterical_history = obsterical_history;
    }

    public String getFamily_history() {
        return family_history;
    }

    public void setFamily_history(String family_history) {
        this.family_history = family_history;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getPulse() {
        return pulse;
    }

    public void setPulse(String pulse) {
        this.pulse = pulse;
    }

    public String getBreathe() {
        return breathe;
    }

    public void setBreathe(String breathe) {
        this.breathe = breathe;
    }

    public String getBlood_pressure() {
        return blood_pressure;
    }

    public void setBlood_pressure(String blood_pressure) {
        this.blood_pressure = blood_pressure;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getGeneral_condition() {
        return general_condition;
    }

    public void setGeneral_condition(String general_condition) {
        this.general_condition = general_condition;
    }

    public String getSkin_mucosa() {
        return skin_mucosa;
    }

    public void setSkin_mucosa(String skin_mucosa) {
        this.skin_mucosa = skin_mucosa;
    }

    public String getLymphaden() {
        return lymphaden;
    }

    public void setLymphaden(String lymphaden) {
        this.lymphaden = lymphaden;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getNeck() {
        return neck;
    }

    public void setNeck(String neck) {
        this.neck = neck;
    }

    public String getChest() {
        return chest;
    }

    public void setChest(String chest) {
        this.chest = chest;
    }

    public String getBelly() {
        return belly;
    }

    public void setBelly(String belly) {
        this.belly = belly;
    }

    public String getAnal_genitalia() {
        return anal_genitalia;
    }

    public void setAnal_genitalia(String anal_genitalia) {
        this.anal_genitalia = anal_genitalia;
    }

    public String getSpine() {
        return spine;
    }

    public void setSpine(String spine) {
        this.spine = spine;
    }

    public String getReflex() {
        return reflex;
    }

    public void setReflex(String reflex) {
        this.reflex = reflex;
    }

    public String getSpecial_case() {
        return special_case;
    }

    public void setSpecial_case(String special_case) {
        this.special_case = special_case;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    public String getModified_diagnosis() {
        return modified_diagnosis;
    }

    public void setModified_diagnosis(String modified_diagnosis) {
        this.modified_diagnosis = modified_diagnosis;
    }

    public String getModified_diagnosis_name() {
        return modified_diagnosis_name;
    }

    public void setModified_diagnosis_name(String modified_diagnosis_name) {
        this.modified_diagnosis_name = modified_diagnosis_name;
    }

    public Date getModified_diagnosis_day() {
        return modified_diagnosis_day;
    }

    public void setModified_diagnosis_day(Date modified_diagnosis_day) {
        this.modified_diagnosis_day = modified_diagnosis_day;
    }

    public String getTentative_diagnosis() {
        return tentative_diagnosis;
    }

    public void setTentative_diagnosis(String tentative_diagnosis) {
        this.tentative_diagnosis = tentative_diagnosis;
    }

    public String getTentative_diagnosis_name() {
        return tentative_diagnosis_name;
    }

    public void setTentative_diagnosis_name(String tentative_diagnosis_name) {
        this.tentative_diagnosis_name = tentative_diagnosis_name;
    }

    public Date getTentative_diagnosis_day() {
        return tentative_diagnosis_day;
    }

    public void setTentative_diagnosis_day(Date tentative_diagnosis_day) {
        this.tentative_diagnosis_day = tentative_diagnosis_day;
    }

    public String getSupplementary_diagnosis() {
        return supplementary_diagnosis;
    }

    public void setSupplementary_diagnosis(String supplementary_diagnosis) {
        this.supplementary_diagnosis = supplementary_diagnosis;
    }

    public String getSupplementary_diagnosis_name() {
        return supplementary_diagnosis_name;
    }

    public void setSupplementary_diagnosis_name(String supplementary_diagnosis_name) {
        this.supplementary_diagnosis_name = supplementary_diagnosis_name;
    }

    public Date getSupplementary_diagnosis_day() {
        return supplementary_diagnosis_day;
    }

    public void setSupplementary_diagnosis_day(Date supplementary_diagnosis_day) {
        this.supplementary_diagnosis_day = supplementary_diagnosis_day;
    }

    public String getFinal_diagnosis() {
        return final_diagnosis;
    }

    public void setFinal_diagnosis(String final_diagnosis) {
        this.final_diagnosis = final_diagnosis;
    }

    public String getFinal_diagnosis_name() {
        return final_diagnosis_name;
    }

    public void setFinal_diagnosis_name(String final_diagnosis_name) {
        this.final_diagnosis_name = final_diagnosis_name;
    }

    public Date getFinal_diagnosis_day() {
        return final_diagnosis_day;
    }

    public void setFinal_diagnosis_day(Date final_diagnosis_day) {
        this.final_diagnosis_day = final_diagnosis_day;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    @Override
    public String toString() {
        return "Hospitalized{" +
                "id=" + id +
                ", card_medical='" + card_medical + '\'' +
                ", record_day=" + record_day +
                ", history_statement='" + history_statement + '\'' +
                ", main_suit='" + main_suit + '\'' +
                ", present_illness_history='" + present_illness_history + '\'' +
                ", anamnesis='" + anamnesis + '\'' +
                ", personal_history='" + personal_history + '\'' +
                ", obsterical_history='" + obsterical_history + '\'' +
                ", family_history='" + family_history + '\'' +
                ", temperature='" + temperature + '\'' +
                ", pulse='" + pulse + '\'' +
                ", breathe='" + breathe + '\'' +
                ", blood_pressure='" + blood_pressure + '\'' +
                ", weight=" + weight +
                ", general_condition='" + general_condition + '\'' +
                ", skin_mucosa='" + skin_mucosa + '\'' +
                ", lymphaden='" + lymphaden + '\'' +
                ", head='" + head + '\'' +
                ", neck='" + neck + '\'' +
                ", chest='" + chest + '\'' +
                ", belly='" + belly + '\'' +
                ", anal_genitalia='" + anal_genitalia + '\'' +
                ", spine='" + spine + '\'' +
                ", reflex='" + reflex + '\'' +
                ", special_case='" + special_case + '\'' +
                ", accessory='" + accessory + '\'' +
                ", modified_diagnosis='" + modified_diagnosis + '\'' +
                ", modified_diagnosis_name='" + modified_diagnosis_name + '\'' +
                ", modified_diagnosis_day=" + modified_diagnosis_day +
                ", tentative_diagnosis='" + tentative_diagnosis + '\'' +
                ", tentative_diagnosis_name='" + tentative_diagnosis_name + '\'' +
                ", tentative_diagnosis_day=" + tentative_diagnosis_day +
                ", supplementary_diagnosis='" + supplementary_diagnosis + '\'' +
                ", supplementary_diagnosis_name='" + supplementary_diagnosis_name + '\'' +
                ", supplementary_diagnosis_day=" + supplementary_diagnosis_day +
                ", final_diagnosis='" + final_diagnosis + '\'' +
                ", final_diagnosis_name='" + final_diagnosis_name + '\'' +
                ", final_diagnosis_day=" + final_diagnosis_day +
                ", status='" + status + '\'' +
                ", create_time=" + create_time +
                '}';
    }

    public Hospitalized() {
        super();
    }

    public Hospitalized(String card_medical, Date record_day, String history_statement, String main_suit, String present_illness_history, String anamnesis, String personal_history, String obsterical_history, String family_history, String temperature, String pulse, String breathe, String blood_pressure, Double weight, String general_condition, String skin_mucosa, String lymphaden, String head, String neck, String chest, String belly, String anal_genitalia, String spine, String reflex, String special_case, String accessory, String modified_diagnosis, String modified_diagnosis_name, Date modified_diagnosis_day, String tentative_diagnosis, String tentative_diagnosis_name, Date tentative_diagnosis_day, String supplementary_diagnosis, String supplementary_diagnosis_name, Date supplementary_diagnosis_day, String final_diagnosis, String final_diagnosis_name, Date final_diagnosis_day, String status, Date create_time) {
        this.card_medical = card_medical;
        this.record_day = record_day;
        this.history_statement = history_statement;
        this.main_suit = main_suit;
        this.present_illness_history = present_illness_history;
        this.anamnesis = anamnesis;
        this.personal_history = personal_history;
        this.obsterical_history = obsterical_history;
        this.family_history = family_history;
        this.temperature = temperature;
        this.pulse = pulse;
        this.breathe = breathe;
        this.blood_pressure = blood_pressure;
        this.weight = weight;
        this.general_condition = general_condition;
        this.skin_mucosa = skin_mucosa;
        this.lymphaden = lymphaden;
        this.head = head;
        this.neck = neck;
        this.chest = chest;
        this.belly = belly;
        this.anal_genitalia = anal_genitalia;
        this.spine = spine;
        this.reflex = reflex;
        this.special_case = special_case;
        this.accessory = accessory;
        this.modified_diagnosis = modified_diagnosis;
        this.modified_diagnosis_name = modified_diagnosis_name;
        this.modified_diagnosis_day = modified_diagnosis_day;
        this.tentative_diagnosis = tentative_diagnosis;
        this.tentative_diagnosis_name = tentative_diagnosis_name;
        this.tentative_diagnosis_day = tentative_diagnosis_day;
        this.supplementary_diagnosis = supplementary_diagnosis;
        this.supplementary_diagnosis_name = supplementary_diagnosis_name;
        this.supplementary_diagnosis_day = supplementary_diagnosis_day;
        this.final_diagnosis = final_diagnosis;
        this.final_diagnosis_name = final_diagnosis_name;
        this.final_diagnosis_day = final_diagnosis_day;
        this.status = status;
        this.create_time = create_time;
    }
}
