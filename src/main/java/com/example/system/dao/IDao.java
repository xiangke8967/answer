package com.example.system.dao;

import java.util.List;

/**
 * @author xk
 * @date 2019-10-17 22:12
 */
public interface IDao<T> {

    Integer insert(T t);

    Integer deleteById(Integer id);

    Integer delete(T t);

    Integer update(T t);

    T findById(Integer id);

    List<T> findList(T t);

}
