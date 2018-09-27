package com.example.controller;

import com.example.entity.SysUser;
import com.example.service.SysUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping(value = "/user")
public class SysUserController {
    @Resource
    private SysUserService sysUserService ;

    /**
     * /user/{id}请求，获取指定id的用户数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public SysUser get(@PathVariable Integer id){
        return sysUserService.get(id);
    }

    /**
     * /user/all请求，获取用户数据
     * @return
     */
    @GetMapping("/all")
    public List<SysUser> findA(){
        return sysUserService.findAll();
    }

    /**
     * /user/nickname请求，获取指定昵称,需要传递一个昵称参数
     * @param account
     */
    @GetMapping("/account")
    public SysUser findAccountBy(@RequestParam String account){
        return sysUserService.getUserByAccount(account);
    }

    /**
     * /user/nickname 请求，获取根据昵称关键词查询的用户数据，
     * 需要传递一个昵称关键词作为参数，
     * 且因为是第二种方法，参数需要：%简书%的形式
     * @param keywords
     */
    @GetMapping("/nickname")
    public List<SysUser> getUsersByNicknameLike(@RequestParam String keywords){
        return sysUserService.findSysUsersNicknameLike(keywords);
    }

    /**
     * /user/order请求，获取根据昵称关键词
     * 查询并按粉丝数降序排列的用户数据，
     * 需要传递一个昵称关键词作为参数，
     * 自己写的查询，参数只需要传递字符串
     * @param nickname
     */
    @GetMapping("/order")
    public List<SysUser> getUsersOrderByfans(@RequestParam String nickname){
        return sysUserService.getUsersOrOrderByFansAnd(nickname);
    }
}

