package OOP;

import java.awt.*;

class Circle extends Shape {
        double radius;

        public Double getArea(Double radius) {
            double area = Math.PI * (radius * radius);
            return area;
        }


        public Double getPerimeter(Double radius) {
            double perimeter = 2 * Math.PI * radius;
            return perimeter;
        }
    }

