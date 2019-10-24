package com.example.springbootdemo2.dao;

import com.example.springbootdemo2.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author: huiqi
 * @CreateTime: 2019-10-21 18:09
 */

@Mapper
public interface UserDao {
    int deletePrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectById(int id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
