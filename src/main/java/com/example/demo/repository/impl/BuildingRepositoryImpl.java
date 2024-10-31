package com.example.demo.repository.impl;

import org.springframework.stereotype.Repository;
import com.example.demo.repository.BuildingRepository;
import com.example.demo.repository.entity.BuildingEntity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BuildingRepositoryImpl implements BuildingRepository {
    static final String DB_URL = "jdbc:mysql://localhost:3306/estatebasic";
    static final String USER = "root";
    static final String PASS = "12345";
    @Override
    public List<BuildingEntity> findAll() {
        String query = "SELECT * FROM building";
        List<BuildingEntity> buildingEntities = new ArrayList<>();
        try(Connection con = DriverManager.getConnection(DB_URL, USER, PASS)){
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()){
                BuildingEntity be = new BuildingEntity();
                be.setName(rs.getString("name"));
                be.setNumberOfBasement(rs.getInt("numberofbasement"));
                be.setStreet(rs.getString("street"));
                be.setWard(rs.getString("ward"));
                buildingEntities.add(be);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return buildingEntities;
    }
}
