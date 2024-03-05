package org.cubytechnologies;

import lombok.*;

@Data
@EqualsAndHashCode(callSuper = false)
public class Sphere extends Shape {
    private double radiusSphere; //радиус сферы

    public Sphere(double radiusSphere) {
        this.radiusSphere = radiusSphere;
    }

    @Override
    public void calcVolume() {
        this.setVolume((4 * Math.PI * Math.pow(radiusSphere, 3)) / 3);
        System.out.println("Объем конуса = " + super.getVolume());
    }

    @Override
    public void calcArea() {
        this.setArea(4 * Math.PI * Math.pow(radiusSphere, 2));
        System.out.println("Площадь поверхности конуса = " + super.getArea());
    }
}
