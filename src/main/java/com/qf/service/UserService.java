package com.qf.service;

import com.qf.domain.User;

import java.util.List;

/**
 * Created by ding on 2019/11/27.
 */
public interface UserService {
    List<User> findAll();
    User findById(Integer id);
    User update(User user);
    String deleteById(Integer id);
}
