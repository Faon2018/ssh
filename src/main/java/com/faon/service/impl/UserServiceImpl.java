package com.faon.service.impl;

import com.faon.dao.UserDao;
import com.faon.entity.User;
import com.faon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Faon
 * @Date 2019/5/10  17:05
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    //自动注入userDao，也可以使用@Autowired
    @Autowired
    private UserDao userDao;


    @Override
    public boolean addUser(User user) {
        this.userDao.add(user);
        return true;
    }

    @Override
    public boolean login(User user) {
        return this.userDao.login(user);
    }

    @Override
    public List getAllUser() {
        return this.userDao.getUser();
    }

    @Override
    public User getUserById(int id) {
        return this.userDao.getUser(id);
    }

    @Override
    public boolean updateUser(User user) {
        this.userDao.update(user);
        return true;

    }

    @Override
    public boolean deleteUser(int id) {
        this.userDao.delete(id);
        return true;
    }
}
