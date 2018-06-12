package com.cxq.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Administrator on 2018/4/11/011.
 */
public interface MedicalRecordRepository extends JpaRepository<MedicalRecord,Long>{

     @Query("select  m.name, m.sex, m.card_id, m.main_diagnosis from MedicalRecord m ")
    List<MedicalRecord> findAduit();

}
