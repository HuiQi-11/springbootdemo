package com.example.springbootdemo2.service;

import com.example.springbootdemo2.dao.UserDao;
import com.example.springbootdemo2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @Author: huiqi
 * @CreateTime: 2019-10-21 18:10
 */

@Repository
public interface UserService {
    void save(User user);

    User getUser(int id);

    boolean updateById(User user);

    boolean deleteById(int id);
}
