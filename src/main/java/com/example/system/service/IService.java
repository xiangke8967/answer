package com.example.system.service;

import com.example.system.entity.PageParam;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author xk
 * @date 2019-10-20 21:52
 */
public interface IService<T> {

    Integer insert(T t);

    Integer deleteById(Integer id);

    Integer delete(T t);

    Integer update(T t);

    T findById(Integer id);

    List<T> findList(T t);

    List<T> findPage(T t, PageParam pageParam);
}
