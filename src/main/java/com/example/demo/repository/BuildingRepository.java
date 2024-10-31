package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import com.example.demo.repository.entity.BuildingEntity;

import java.util.List;

@Repository
public interface BuildingRepository {
    List<BuildingEntity> findAll();
}
