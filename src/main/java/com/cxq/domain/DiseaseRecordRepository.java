package com.cxq.domain;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


/**
 * Created by Administrator on 2018/4/11/011.
 */
public interface DiseaseRecordRepository extends JpaRepository<DiseaseRecord,Long>{
@Query("select p from DiseaseRecord p where p.card_medical=?1")
 DiseaseRecord find_one(String card_medical);

 //新建

// @Query("insert into DiseaseRecord(department,card_medical,keyword) values(?1,?2,?3)")
 //int add_keyword();

  List<DiseaseRecord> findByKeyword(String keyword);

}
