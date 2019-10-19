package com.example.system.entity.po;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "`t_user_question`")
public class UserQuestion {
    /**
     * 主键
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 题目id
     */
    @Column(name = "`question_id`")
    private Integer questionId;

    /**
     * 用户id
     */
    @Column(name = "`user_id`")
    private Integer userId;

    /**
     * 是否正确
     */
    @Column(name = "`is_true`")
    private Integer isTrue;

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