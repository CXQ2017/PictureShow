package com.cxq.domain;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Administrator on 2018/3/2.
 */
public interface PicturePropertyRepository extends JpaRepository<PictureProperty, Long>{

    @Query("select p from PictureProperty p where p.picture_path =?1")
     List<PictureProperty> findByPath (String path);

    @Query("select p from PictureProperty p GROUP BY p.keyword")
    List<PictureProperty> findListKeyword();

    @Query("select p from PictureProperty p where p.status = 0")
    List<PictureProperty> findNoMark();

    @Query("select p from PictureProperty p  where p.keyword=?1 and p.case_module=?2")
    List<PictureProperty> findByKeyAcase(String keyword,String case_module);

}
