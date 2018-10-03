package com.example.service.impl;

import com.example.dao.PictureRespository;
import com.example.entity.Picture;
import com.example.service.PictureService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PictureServiceImpl implements PictureService {
    @Resource
    private PictureRespository pictureRespository ;
    @Override
    public List<Picture> getPictures() {
        return pictureRespository.findAll();
    }

}
