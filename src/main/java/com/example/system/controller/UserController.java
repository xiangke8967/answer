package com.example.system.controller;

import com.example.system.entity.PageParam;
import com.example.system.entity.dto.UserDTO;
import com.example.system.entity.po.User;
import com.example.system.service.UserService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
@Api(tags = "用户相关接口")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/page")
    @ApiOperation("分页查询")
    public PageInfo<User> page(@RequestBody UserDTO userDTO){
        User user = new User();
        user.setAccount(userDTO.getAccount());
        PageParam pageParam = new PageParam();
        pageParam.setPage(userDTO.getPage());
        pageParam.setRows(userDTO.getRows());

        return new PageInfo<User>(userService.findPage(pageParam));
    }
}
