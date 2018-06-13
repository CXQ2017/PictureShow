package com.cxq.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2018/4/11/011.
 */
public interface CheckRecordRepository extends JpaRepository<CheckRecord,Long> {

    List<CheckRecord> findByKeyword(String keyword);

}
