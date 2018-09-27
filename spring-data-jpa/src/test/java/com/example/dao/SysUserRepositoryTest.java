package com.example.dao;

import com.example.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserRepositoryTest {
    @Resource
    SysUserRepository sysUserRepository;

    @Test
    public void initData(){
        SysUser[] users ={
                new SysUser("ggg@qq.com","111","简书",1000),
                new SysUser("hhh@qq.com","222","简",222),
                new SysUser("iii@qq.com","333","lost",123),
                new SysUser("jjj@qq.com","444","一只猴子",421),
                new SysUser("kkk@qq.com","555","猴",444),
                new SysUser("lll@qq.com","777","柯南道尔",137)
        };

        for (int i = 0 ; i < 6 ; i++ ){
            sysUserRepository.save(users[i]);
        }
    }

    @Test
    public void findUser(){
        SysUser sysUser = sysUserRepository.findUser("简书大学堂");
        System.out.println(sysUser);
    }

//    @Test
//    public void findUserAll(){
//        List<SysUser> sysUsers = sysUserRepository.findUserAll("简书");
//        sysUsers.forEach(sysUser -> System.out.println(sysUser));
//    }
}