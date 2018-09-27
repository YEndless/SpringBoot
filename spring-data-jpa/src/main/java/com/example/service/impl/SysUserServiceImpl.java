package com.example.service.impl;

import com.example.dao.SysUserRepository;
import com.example.entity.SysUser;
import com.example.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserRepository sysUserRepository ;


    @Override
    public SysUser get(Integer id) {
        return sysUserRepository.findById(id).get();
    }

    @Override
    public List<SysUser> findAll() {
        return sysUserRepository.findAll();
    }

    @Override
    public SysUser getUserByAccount(String account) {
        return sysUserRepository.findByAccount(account);
    }

    @Override
    public List<SysUser> findSysUsersNicknameLike(String keywords) {
        return sysUserRepository.findByNicknameLike(keywords);
    }

    @Override
    public SysUser findUser(String nickname) {
        return sysUserRepository.findUser(nickname);
    }

    @Override
    public List<SysUser> getUsersOrOrderByFansAnd(String nickname) {
        return sysUserRepository.findSysUsers(nickname);
    }
}