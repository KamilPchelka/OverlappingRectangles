package com.company;

public class Main {

    public static void main(String[] args) {
        Coordinate leftBottom1 = new Coordinate(-1, -1);
        Coordinate rightTop1 = new Coordinate(10, 10);
        Coordinate leftBottom2 = new Coordinate(-1, 0);
        Coordinate rightTop2 = new Coordinate(3, 9);

        Rectangle rectangle = new Rectangle(leftBottom1, rightTop1);
        Rectangle rectangle2 = new Rectangle(leftBottom2, rightTop2);

        System.out.println(rectangle.getOverlapArea(rectangle2));

    }
}
