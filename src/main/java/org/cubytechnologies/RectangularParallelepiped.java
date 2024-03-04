package org.cubytechnologies;

import lombok.*;

@Data
@EqualsAndHashCode(callSuper = false)
public class RectangularParallelepiped extends Shape {
    private double width; //шираини основания параллелепипеда
    private double length; //длина основания параллелепипеда
    private double height; //высота параллелепипеда

    public RectangularParallelepiped(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    @Override
    public void calcVolume() {
        super.setVolume(width * length * height);
        System.out.println("Объем прямоугольного параллелепипеда = " + super.getVolume());
    }

    @Override
    public void calcArea() {
        super.setArea(2 * width * length + 2 * width * height + 2 * length * height);
        System.out.println("Площадь прямоугольного параллелепипеда = " + super.getArea());
    }
}
