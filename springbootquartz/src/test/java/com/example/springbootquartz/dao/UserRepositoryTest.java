package com.example.springbootquartz.dao;

import com.example.springbootquartz.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
    @Resource
    private UserRepository userRepository;

    @Test
    public void save() {
        User[] users = {
                new User("1111", "1111", "TmacQiu", "http://pggwbgcbl.bkt.clouddn.com/two.png"),
                new User("2222", "2222", "逍遥", "http://pggwbgcbl.bkt.clouddn.com/four.png"),
                new User("3333", "3333", "夜未央", "http://pggwbgcbl.bkt.clouddn.com/30.jpg"),
                new User("4444", "4444", "zp", "http://pggwbgcbl.bkt.clouddn.com/31.jpg"),
                new User("5555", "5555", "小白", "http://pggwbgcbl.bkt.clouddn.com/3.jpg"),
                new User("6666", "6666", "班花", "http://pggwbgcbl.bkt.clouddn.com/one.jpg")
        };

        for (int i = 0; i < users.length; i++) {
            userRepository.save(users[i]);
        }
    }

    @Test
    public void findByAccount() {
        System.out.println(userRepository.findByAccount("5555"));
    }
}