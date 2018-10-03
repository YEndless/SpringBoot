package com.example.service;

import com.example.entity.Album;

import java.util.List;

public interface AlbumService {
    /**
     * 按相册喜欢数获取热门相册
     * @return
     */
    List<Album> getHotAlbums();
}