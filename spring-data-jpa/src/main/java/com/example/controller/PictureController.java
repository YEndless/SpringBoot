package com.example.controller;

import com.example.entity.Picture;
import com.example.service.PictureService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/picture")
public class PictureController {
    @Resource
    private PictureService pictureService;

    @GetMapping("/list")
    public List<Picture> getMyPictures(){
        return pictureService.getPictures();
    }


}
