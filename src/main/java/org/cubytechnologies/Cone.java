package org.cubytechnologies;

import lombok.*;

@Getter
@EqualsAndHashCode(callSuper = false)
@ToString
public class Cone extends Shape {
    private double radiusCone; //радиус основания конуса
    private double heightCone; //высота конуса
    private double coneGenerate; //образующая конуса

    public Cone(double radiusCone, double heightCone) {
        this.radiusCone = radiusCone;
        this.heightCone = heightCone;
        setConeGenerate();
    }

    public void setRadiusCone(double radiusCone) {
        this.radiusCone = radiusCone;
    }

    public void setHeightCone(double heightCone) {
        this.heightCone = heightCone;
    }

    public void setConeGenerate() {
        coneGenerate = Math.sqrt((Math.pow(radiusCone, 2) + (Math.pow(heightCone, 2))));
    }

    @Override
    public void calcVolume() {
        this.setVolume((Math.PI * Math.pow(radiusCone, 2) * heightCone) / 3);
        System.out.println("Объем конуса = " + super.getVolume());
    }

    @Override
    public void calcArea() {
        this.setArea((Math.PI * Math.pow(radiusCone, 2) + Math.PI * radiusCone * coneGenerate));
        System.out.println("Площадь поверхности конуса = " + super.getArea());
    }
}
