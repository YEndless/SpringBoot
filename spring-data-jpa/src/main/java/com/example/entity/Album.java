package com.example.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * 相册类
 */
@Entity
@Data
public class Album {
    @Id
    @GeneratedValue
    private Integer id;

    private String albumCover;

    private String albumTitle;

    private String albumDescription;

    private Integer likes;

    //映射一对多的关联关系,默认使用懒加载。cascade设置级联删除。
    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.REMOVE})
    //外键
    @JoinColumn(name = "topic_id")
    private List<Album> albumList;

    public List<Album> getAlbumList() {
        return albumList;
    }

    public void setAlbumList(List<Album> albumList) {
        this.albumList = albumList;
    }

    public Album(String albumCover, String albumTitle, String albumDescription, Integer likes) {
        this.albumCover = albumCover;
        this.albumTitle = albumTitle;
        this.albumDescription = albumDescription;
        this.likes = likes;
    }

    public Album() {
    }
}
