package com.example.dao;

import com.example.entity.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRespository extends JpaRepository<Photo ,Integer> {
}
