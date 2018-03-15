package com.gavin.service.impl;

/**
 * Created by Administrator on 2017/6/12.
 */

import com.gavin.dao.UserDAO;
import com.gavin.model.User;
import com.gavin.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDAO userDAO;
    public User getUser(User paramUser) {
        User user  =  userDAO.getUser(paramUser);
        return user;
    }
    public List<User> findAll() {
        List<User> all = userDAO.findAll();
        return all;
    }
}
