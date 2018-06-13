package com.cxq.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2018/4/11/011.
 */
public interface DischargeRecordRepository extends JpaRepository<DischargeRecord,Long> {

    List<DischargeRecord> findByKeyword(String keyword);
}
