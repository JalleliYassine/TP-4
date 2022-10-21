package TP4.EX1;

import java.lang.reflect.Method;

public class Point {
    private Double x ;
    private Double y ;

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double distance() {
        return Math.sqrt(x*x + y*y);
    }

    public String toString() {
        return "[" + x + ":" + y + "]";
    }
}
