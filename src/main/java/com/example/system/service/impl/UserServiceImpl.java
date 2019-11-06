package com.example.system.service.impl;

import com.example.system.dao.UserDao;
import com.example.system.entity.PageParam;
import com.example.system.entity.po.User;
import com.example.system.mapper.UserMapper;
import com.example.system.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer insert(User user) {
        return null;
    }

    @Override
    public Integer deleteById(Integer id) {
        return null;
    }

    @Override
    public Integer delete(User user) {
        return null;
    }

    @Override
    public Integer update(User user) {
        return null;
    }

    @Override
    public User findById(Integer id) {
        return null;
    }

    @Override
    public List<User> findList(User user) {
        return null;
    }

    @Override
    public List<User> findPage(User user, PageParam pageParam) {
        return null;
    }

    public List<User> findPage( PageParam pageParam) {
        if(Objects.nonNull(pageParam)){
            PageHelper.startPage(pageParam.getPage(),pageParam.getRows());
        }
        return userMapper.selectAll();
    }
}
