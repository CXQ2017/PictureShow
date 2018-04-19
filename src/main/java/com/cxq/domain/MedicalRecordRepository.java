package com.cxq.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2018/4/11/011.
 */
public interface MedicalRecordRepository extends JpaRepository<MedicalRecord,Long>{

//     @Query("select m from MedicalRecord m where m.card_medical=?1")
//    public int addFirstpageData();

}
