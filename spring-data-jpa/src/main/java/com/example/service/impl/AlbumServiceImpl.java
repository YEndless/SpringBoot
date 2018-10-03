package com.example.service.impl;

import com.example.dao.AlbumResponsitory;
import com.example.entity.Album;
import com.example.service.AlbumService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {
    @Resource
    private AlbumResponsitory albumResponsitory ;
    @Override
    public List<Album> getHotAlbums() {
        return albumResponsitory.findHotAlbums();
    }
}
