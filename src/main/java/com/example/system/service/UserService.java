package com.example.system.service;

import com.example.system.entity.PageParam;
import com.example.system.entity.po.User;

import java.util.List;

public interface UserService extends IService<User> {

    List<User> findPage(PageParam pageParam);
}
