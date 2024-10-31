package com.example.demo.service.impl;

import com.example.demo.model.BuildingModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.BuildingRepository;
import com.example.demo.repository.entity.BuildingEntity;
import com.example.demo.service.BuildingService;

import java.util.ArrayList;
import java.util.List;

@Service
public class BuildingServiceImpl implements BuildingService {

    @Autowired
    private BuildingRepository buildingRepository;

    @Override
    public List<BuildingModel> findAll() {
        List<BuildingEntity> buildingEntities = buildingRepository.findAll();
        List<BuildingModel> buildingModels = new ArrayList<>();
        for(BuildingEntity building : buildingEntities){
            BuildingModel bm = new BuildingModel();
            bm.setName(building.getName());
            bm.setNumberOfBasement(building.getNumberOfBasement());
            bm.setAddress(building.getStreet() + ", " + building.getWard());
            buildingModels.add(bm);
        }
        return buildingModels;
    }
}
