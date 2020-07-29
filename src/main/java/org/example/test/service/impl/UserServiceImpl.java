package org.example.test.service.impl;

import org.example.test.dao.UserDao;
import org.example.test.entity.User;
import org.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Transactional
    public boolean register(User user) {
        if(userDao.querySpecificUser(user)!=null){
            return false;
        }else{
            user.setCreateTime(new Date());
            userDao.insertUser(user);
            return true;
        }
    }

    @Override
    public List<User> query() {
        return userDao.query();
    }
}
