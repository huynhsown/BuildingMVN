package com.example.demo.api;

import com.example.demo.model.BuildingModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.BuildingService;

import java.util.List;

@RestController
public class BuildingAPI {

    @Autowired
    private BuildingService buildingService;

    @GetMapping("/api/building")
    public List<BuildingModel> findAll() {
        return buildingService.findAll();
    }

    @GetMapping("/")
    public String ello() {
        return "HELLO";
    }
}
