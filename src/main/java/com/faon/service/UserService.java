package com.faon.service;

import com.faon.entity.User;

import java.util.List;

/**
 * @author Faon
 * @Date 2019/5/10  17:04
 */
public interface UserService {
    public boolean addUser(User user);

    public boolean login(User user);

    public List getAllUser();

    public User getUserById(int id);

    public boolean updateUser(User user);

    public boolean deleteUser(int id);
}
