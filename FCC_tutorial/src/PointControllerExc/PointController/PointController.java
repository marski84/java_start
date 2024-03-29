package PointControllerExc.PointController;

import PointControllerExc.Point.Point;

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
}
