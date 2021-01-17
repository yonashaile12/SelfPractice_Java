package Abstraction_Practice;

public abstract class Shape {

    public static String name;
    public double area;
    public double perimeter;
    public static boolean hasVolume;
    public double volume;

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

}
interface volume{
    public abstract double calculateVolume();
}


class Circle extends Shape{

    public double radius;
    public double calculateArea(){
        return Math.pow(radius, 2) * Math.PI;
    }

    public double calculatePerimeter(){
        return radius * 2 * Math.PI;
    }
}

class Rectangle extends Shape{
        double length;
        double width;
    @Override
    public double calculateArea() {
        return width * length;
    }

    @Override
    public double calculatePerimeter() {
        return length * 2 + width * 2;
    }
}

class Square extends Shape{
    double side;

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double calculatePerimeter() {
        return side + side + side + side;
    }
}

class Cylinder extends Shape implements volume{

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }
}







