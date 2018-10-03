package com.example.dao;

import com.example.entity.Picture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PictureRespository extends JpaRepository<Picture,Integer>{
}
