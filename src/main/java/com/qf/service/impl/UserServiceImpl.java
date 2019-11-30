package com.qf.service.impl;

import com.qf.domain.User;
import com.qf.repository.UserRepository;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by ding on 2019/11/27.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> findAll() {
        List<User> all = userRepository.findAll();
        return all;
    }

    @Override
    public User findById(Integer id) {
        Optional<User> byId = userRepository.findById(id);
        User user=null;
        if(byId!=null){
            user =byId.get();
        }
        return user;
    }

    @Override
    public User update(User user) {
        return userRepository.saveAndFlush(user);

    }
    @Override
    public String deleteById(Integer id) {
        try {
            userRepository.deleteById(id);
            return "成功";
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "fail";
    }
}
