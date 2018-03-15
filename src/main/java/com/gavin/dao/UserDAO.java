package com.gavin.dao;
import java.util.List;
import java.util.Map;

import com.gavin.model.User;

public interface UserDAO {
    User getUser(User paramUser);
    List<User> findAll();
}