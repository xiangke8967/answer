package com.example.system.mapper;

import com.example.system.entity.po.Question;
import com.example.system.entity.po.QuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface QuestionMapper extends Mapper<Question> {
    long countByExample(QuestionExample example);

    int deleteByExample(QuestionExample example);

    List<Question> selectByExample(QuestionExample example);

    int updateByExampleSelective(@Param("record") Question record, @Param("example") QuestionExample example);

    int updateByExample(@Param("record") Question record, @Param("example") QuestionExample example);
}