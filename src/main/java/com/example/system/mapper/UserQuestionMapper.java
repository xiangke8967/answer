package com.example.system.mapper;

import com.example.system.entity.po.UserQuestion;
import com.example.system.entity.po.UserQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UserQuestionMapper extends Mapper<UserQuestion> {
    long countByExample(UserQuestionExample example);

    int deleteByExample(UserQuestionExample example);

    List<UserQuestion> selectByExample(UserQuestionExample example);

    int updateByExampleSelective(@Param("record") UserQuestion record, @Param("example") UserQuestionExample example);

    int updateByExample(@Param("record") UserQuestion record, @Param("example") UserQuestionExample example);
}