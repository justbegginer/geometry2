package classes.figures2D;


import classes.figuresAbstract.Point;

import java.util.ArrayList;

public class Point2D extends Point {
    public Point2D(int x, int y){
        super(x, y);
    }


    public static boolean isPointsOnSameLine(ArrayList<Point2D> points){
        if (points.size() <= 1){
            return true;
        }
        //(x_3 - x_1) / (x_2 - x_1) == (y_3 - y_1) / (y_2 - y_1)
        for (int i = 2 ; i <  points.size(); i++){
            if (((points.get(i).getX() - points.get(i - 2).getX()) / (points.get(i - 1).getX() - points.get(i - 2).getX()))
                    != ((points.get(i).getY() - points.get(i - 2).getY()) / (points.get(i - 1).getY() - points.get(i - 2).getY()))){
                return false;
            }
        }
        return true;
    }
}
