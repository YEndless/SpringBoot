package com.example.springbootquartz.dao;

import com.example.springbootquartz.entity.Sport;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SportRepositoryTest {
    @Resource
    private SportRepository sportRepository;

    @Test
    public void save() {
        Sport[] sports = {
                new Sport("1111", 21234),
                new Sport("2222", 8888),
                new Sport("3333", 2122),
                new Sport("4444", 11111),
                new Sport("5555", 9900),
                new Sport("6666", 12345),
        };
        for (int i = 0; i < sports.length; i++) {
            sportRepository.save(sports[i]);
        }
    }

    @Test
    public void findAll() {
        System.out.println(sportRepository.getAll());
    }

    @Test
    public void findOne() {
        System.out.println(sportRepository.findSportByAccount("2222"));
    }

}