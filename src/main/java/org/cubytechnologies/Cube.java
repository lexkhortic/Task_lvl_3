package org.cubytechnologies;

import lombok.*;

@Data
@EqualsAndHashCode(callSuper = false)
public class Cube extends Shape{
    private double edgeCube; //ребро куба

    public Cube(double edgeCube) {
        this.edgeCube = edgeCube;
    }

    @Override
    public void calcVolume() {
        super.setVolume(Math.pow(edgeCube, 3));
        System.out.println("Объем куба = " + super.getVolume());
    }

    @Override
    public void calcArea() {
        super.setArea(6 * Math.pow(edgeCube, 2));
        System.out.println("Площадь поверхности куба = " + super.getArea());
    }
}
