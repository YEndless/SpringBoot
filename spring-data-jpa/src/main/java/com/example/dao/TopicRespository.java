package com.example.dao;

import com.example.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRespository extends JpaRepository<Topic, String>{
}
