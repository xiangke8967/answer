package com.example.system.dao;

import com.example.system.entity.po.Question;
import com.example.system.entity.po.QuestionExample;
import com.example.system.mapper.QuestionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author xk
 * @date 2019-10-17 22:07
 */
@Repository
public class QuestionDao {

    @Autowired
    private QuestionMapper questionMapper;

    public Integer insert(Question question) {
        questionMapper.insertSelective(question);
        return question.getId();
    }

    public Integer deleteById(Integer id){
        return questionMapper.deleteByPrimaryKey(id);
    }

    public Integer delete(Object o) {
        return null;
    }

    public Integer update(Object o) {
        return null;
    }

    public Object findById(Integer id) {
        return null;
    }

    public List<Question> findList(Question question) {

        return null;
    }

}
