package com.example.system.entity.po;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "`t_user`")
public class User {
    /**
     * 主键
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 账户
     */
    @Column(name = "`account`")
    private String account;

    /**
     * 密码
     */
    @Column(name = "`password`")
    private String password;

    /**
     * 姓名
     */
    @Column(name = "`user_name`")
    private String userName;

    /**
     * 性别
     */
    @Column(name = "`sex`")
    private String sex;

    /**
     * 创建时间
     */
    @Column(name = "`create_time`")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "`update_time`")
    private Date updateTime;
}