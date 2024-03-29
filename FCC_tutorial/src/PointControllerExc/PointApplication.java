package PointControllerExc;

import PointControllerExc.Point.Point;
import PointControllerExc.PointController.PointController;

public class PointApplication {
    public static void main(String[] args) {
        Point point = new Point(10, 10);
        PointController pointController = new PointController();

        point.printCoords();
        pointController.addX(point);
        pointController.addY(point);
        point.printCoords();
        pointController.minusX(point);
        pointController.minusY(point);
        point.printCoords();



    }
}
