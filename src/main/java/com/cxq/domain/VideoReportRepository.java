package com.cxq.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2018/4/12/012.
 */
public interface VideoReportRepository extends JpaRepository<VideoReport,Long> {

    List<VideoReport> findByKeyword(String keyword);
}
