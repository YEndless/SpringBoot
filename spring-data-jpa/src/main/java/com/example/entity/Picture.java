package com.example.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Picture {
    @Id
    @GeneratedValue
    private Integer id ;

    private String pictureCover ;

    private String pictureTitle ;

    private String pictureDescription ;

    private Integer pictureNumber ;

    public Picture() {
    }

    public Picture(String pictureCover, String pictureTitle, String pictureDescription, Integer pictureNumber) {

        this.pictureCover = pictureCover;
        this.pictureTitle = pictureTitle;
        this.pictureDescription = pictureDescription;
        this.pictureNumber = pictureNumber;
    }
}
