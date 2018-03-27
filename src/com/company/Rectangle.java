package com.company;

public class Rectangle {


    private final Coordinate leftBottom;
    private final Coordinate topRight;

    public Rectangle(Coordinate leftBottom, Coordinate topRight) {
        this.leftBottom = leftBottom;
        this.topRight = topRight;
    }

    public Coordinate getLeftBottom() {
        return leftBottom;
    }

    public Coordinate getTopRight() {
        return topRight;
    }


    public int getOverlapArea(Rectangle other) {

        //areaOfIntersection = Max(0, Max(XA2, XB2) - Min(XA1, XB1)) * Max(0, Max(YA2, YB2) - Min(YA1, YB1))
        int areaOfIntersection = Math.max(0, Math.max(this.topRight.getX(), other.topRight.getX())
                - Math.min(this.leftBottom.getX(), other.leftBottom.getX()))
                * Math.max(0, Math.max(this.topRight.getY(), other.topRight.getY())
                - Math.min(this.leftBottom.getY(), other.leftBottom.getY()));
        int result = (this.getArea()) + (other.getArea()) - areaOfIntersection;

        return result > 0 ? result : 0;

    }


    public int getBottomLength() {

        //wzór na długość odcinka między punktami na osi układu współrzednych: http://matematyka.pisz.pl/strona/1248.html
        return (int) Math.sqrt(Math.pow(topRight.getX() - leftBottom.getX(), 2));

    }

    public int getSideLength() {
        //wzór na długość odcinka między punktami na osi układu współrzednych: http://matematyka.pisz.pl/strona/1248.html
        return (int) Math.sqrt(Math.pow(topRight.getY() - leftBottom.getY(), 2));

    }

    public int getArea() {

        return getBottomLength() * getSideLength();
    }
}
