package com.wz.controller;

import com.wz.entity.User;
import com.wz.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-10-21 17:26:58
 */
@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne/{uid}")
    public User selectOne(@PathVariable("uid") Integer id) {
        return this.userService.queryById(id);
    }

}