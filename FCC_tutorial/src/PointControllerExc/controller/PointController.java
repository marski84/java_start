package PointControllerExc.controller;

import PointControllerExc.data.Point;

public class PointController {
    public PointController(){}

    public void addX (Point point) {
        int newValue = point.getX() + 1;
        point.setX(newValue);
    }

    public void minusX (Point point) {
        int newValue = point.getX() - 1;
        point.setX(newValue);
    }
    public void addY (Point point) {
        int newValue = point.getY() + 1;
        point.setY(newValue);
    }
    public void minusY (Point point) {
        int newValue = point.getY() - 1;
        point.setY(newValue);
    }

    public void moveXY(Point point, int param) throws Exception {
        switch (param) {
            case 0 -> {
                point.setX(10);
                point.setY(20);
            }
            case 1 -> {
                point.setX(300);
                point.setY(200);
            }
            default -> throw new Exception("asda");
        }
        }
    }

