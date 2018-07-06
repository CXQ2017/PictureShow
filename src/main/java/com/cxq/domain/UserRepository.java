package com.cxq.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Administrator on 2018/6/12.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select  u  from User u where u.user_name=?1 and u.password=?2")
    List<User> finduser(String name, String password);

//    @Query("delete from User u where u.id=?1")
//    int deleteuserById(Integer id);

    @Query("select u from User u where u.user_name=?1")
    List<User> findByName(String name);
}
