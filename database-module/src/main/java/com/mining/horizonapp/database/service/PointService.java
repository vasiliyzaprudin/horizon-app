package com.mining.horizonapp.database.service;

import com.mining.horizonapp.database.model.Point;
import com.mining.horizonapp.database.repository.PointRepository;

import java.util.List;

public class PointService {

    private final PointRepository pointRepository;

    public PointService() {
        this.pointRepository = new PointRepository();
    }

    public List<Point> getPoints() {
        return pointRepository.getAllPoints();
    }
}