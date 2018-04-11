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
}
