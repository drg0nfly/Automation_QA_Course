package OOP;

import java.awt.*;

class Square extends Shape {
    double side;


    public Double getArea(Double side) {
        double area = side * side;
        return area;
    }

    public Double getPerimeter(Double side) {
        double perimeter = 4 * side;
        return perimeter;
    }
}
