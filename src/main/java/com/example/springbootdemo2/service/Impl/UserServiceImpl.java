package com.example.springbootdemo2.service.Impl;

import com.example.springbootdemo2.dao.UserDao;
import com.example.springbootdemo2.entity.User;
import com.example.springbootdemo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.springbootdemo2.dao.UserDao;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: huiqi
 * @CreateTime: 2019-10-21 18:10
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public void save(User user) {
        userDao.insert(user);

    }

    @Override
    public User getUser(int id) {
        return userDao.selectById(id);
    }

    @Override
    public boolean updateById(User user) {
        return userDao.updateByPrimaryKey(user) > 0;
    }

    @Override
    public boolean deleteById(int id) {
        return userDao.deletePrimaryKey(id) > 0;
    }
}
