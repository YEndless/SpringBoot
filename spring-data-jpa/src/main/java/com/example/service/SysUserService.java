package com.example.service;

import com.example.entity.SysUser;

import java.util.List;

public interface SysUserService {
    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    SysUser get(Integer id) ;

    /**
     * 查询所有用户
     * @return
     */
    List<SysUser> findAll();

    /**
     * 根据账号查询
     * @param account
     * @return
     */
    SysUser getUserByAccount(String account) ;
    /**
     * 通过昵称精确查找全体
     * @param keywords
     * @return
     */
    List<SysUser> findSysUsersNicknameLike(String keywords);

    /**
     * 查询一个昵称是（）用户
     * @param nickname
     * @return
     */
    SysUser findUser(String nickname);

    /**
     * 查询降序
     * @param nickname
     * @return
     */
    List<SysUser> getUsersOrOrderByFansAnd(String nickname) ;
}
