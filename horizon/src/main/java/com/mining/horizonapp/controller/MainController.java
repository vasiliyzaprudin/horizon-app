package com.mining.horizonapp.controller;

import com.mining.horizonapp.database.model.Point;
import com.mining.horizonapp.database.service.PointService;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.List;

public class MainController {
    @FXML
    private Canvas canvas;

    @FXML
    public void initialize() {
        drawGeoPoints();
    }

    private void drawGeoPoints() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        List<Point> points = new PointService().getPoints();

        gc.setFill(Color.RED);
        for (Point point : points) {
            gc.fillOval(point.getX(), point.getY(), 5, 5);
        }
    }
}