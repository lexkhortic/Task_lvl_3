package org.cubytechnologies;

import lombok.*;

@Data
@EqualsAndHashCode(callSuper = false)
public class Cylinder extends Shape {
    private double radiusCylinder; //радиус основания цилиндра
    private double heightCylinder; //высота цилиндра

    public Cylinder(double radiusCylinder, double heightCylinder) {
        this.radiusCylinder = radiusCylinder;
        this.heightCylinder = heightCylinder;
    }

    @Override
    public void calcVolume() {
        super.setVolume(Math.PI * Math.pow(radiusCylinder, 2) * heightCylinder);
        System.out.println("Объем цидлиндра = " + super.getVolume());
    }

    @Override
    public void calcArea() {
        super.setArea(2 * Math.PI * Math.pow(radiusCylinder, 2) +
                2 * Math.PI * radiusCylinder * heightCylinder);
        System.out.println("Площадь поверхности цидлиндра = " + super.getArea());
    }
}
