package com.example.service.impl;

import com.example.dao.SysUserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserServiceImplTest {
    @Resource
    SysUserRepository sysUserRepository ;

    @Test
    public void findByAccountLikeA(String string){
//        SysUser sysUser =
    }

}