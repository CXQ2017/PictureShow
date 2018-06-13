package com.cxq.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2018/4/11 0011.
 */
public interface HospitalizedRepository extends JpaRepository<Hospitalized,Long> {

    List<Hospitalized> findByKeyword(String keyword);

}
