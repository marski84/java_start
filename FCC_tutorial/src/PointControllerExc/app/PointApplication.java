package PointControllerExc.app;

import PointControllerExc.data.Point;
import PointControllerExc.controller.PointController;

public class PointApplication {
    public static void main(String[] args) throws Exception {
        Point point = new Point(10, 10);
        PointController pointController = new PointController();

//        point.printCoords();
//        pointController.addX(point);
//        pointController.addY(point);
//        point.printCoords();
//        pointController.minusX(point);
//        pointController.minusY(point);
//        point.printCoords();
        pointController.moveXY(point, 3);
        point.printCoords();



    }
}
