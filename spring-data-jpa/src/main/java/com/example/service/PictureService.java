package com.example.service;

import com.example.entity.Picture;

import java.util.List;

public interface PictureService {
    /**
     *
     * 获相册
     * @return
     */
    List<Picture> getPictures();

}
