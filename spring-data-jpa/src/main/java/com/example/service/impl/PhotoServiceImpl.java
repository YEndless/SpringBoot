package com.example.service.impl;

import com.example.dao.PhotoRespository;
import com.example.entity.Photo;
import com.example.service.PhotoService;

import javax.annotation.Resource;
import java.util.List;

public class PhotoServiceImpl implements PhotoService {
    @Resource
    private PhotoRespository photoRespository ;

    @Override
    public List<Photo> getAll() {
        return photoRespository.findAll();
    }
}
