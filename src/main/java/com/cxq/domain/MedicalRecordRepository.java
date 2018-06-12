package com.cxq.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Administrator on 2018/4/11/011.
 */
public interface MedicalRecordRepository extends JpaRepository<MedicalRecord,Long>{

//     @Query("select m from MedicalRecord m where m.card_medical=?1")
//    public int addFirstpageData();

//    @Query("select m.card_medical,m.name,m.times_hospitalized from MedicalRecord m ")
//    public List<Object> findPart();
@Query("select p from MedicalRecord p where p.status=2 order by p.create_time desc")
List<MedicalRecord> find_one();

    @Query("select p from MedicalRecord p order by p.create_time desc")
    List<MedicalRecord> find_allmsg();
}
