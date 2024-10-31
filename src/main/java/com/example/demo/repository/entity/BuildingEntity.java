package com.example.demo.repository.entity;

import lombok.Data;

@Data
public class BuildingEntity {
    private String name;
    private Integer numberOfBasement;
    private String ward;
    private String street;
}
