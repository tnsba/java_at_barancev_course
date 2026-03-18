package ru.stqa.pft.sandbox;

public class Rectangle {

    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return this.height * this.width;
    }

}
