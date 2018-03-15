package com.gavin.service;

import com.gavin.model.User;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/12.
 */
public interface UserService {
    User getUser(User paramUser);
    List<User> findAll();
}