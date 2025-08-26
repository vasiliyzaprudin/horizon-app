package com.mining.horizonapp.database.repository;

import com.mining.horizonapp.database.model.Point;
import com.mining.horizonapp.database.config.DatabaseConfig;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PointRepository {

    public List<Point> getAllPoints() {
        List<Point> points = new ArrayList<>();

        try (Connection conn = DatabaseConfig.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(
                     "SELECT x, y FROM geoexpsch.geoexptable")) {

            while (rs.next()) {
                points.add(new Point(rs.getDouble("x"), rs.getDouble("y")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return points;
    }
}