package com.example.system.entity.po;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "`t_question`")
public class Question {
    /**
     * 主键
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 题目名称
     */
    @Column(name = "`question_name`")
    private String questionName;

    /**
     * 选项A
     */
    @Column(name = "`option_a`")
    private String optionA;

    /**
     * 选项B
     */
    @Column(name = "`option_b`")
    private String optionB;

    /**
     * 选项C
     */
    @Column(name = "`option_c`")
    private String optionC;

    /**
     * 选项D
     */
    @Column(name = "`option_d`")
    private String optionD;

    /**
     * 创建时间
     */
    @Column(name = "`create_time`")
    private Date createTime;

    /**
     * 最后一次更新时间
     */
    @Column(name = "`update_time`")
    private Date updateTime;
}