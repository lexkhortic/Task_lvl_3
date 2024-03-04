package org.cubytechnologies;

public class Main {
    public static void main(String[] args) {
        Cube cube = new Cube(10);
        cube.calcVolume();
        cube.calcArea();
        System.out.println();

        Cylinder cylinder = new Cylinder(2, 5);
        cylinder.calcVolume();
        cylinder.calcArea();
        System.out.println();

        Cone cone = new Cone(5, 10);
        cone.calcVolume();
        cone.calcArea();
        System.out.println();

        Sphere sphere = new Sphere(7);
        sphere.calcVolume();
        sphere.calcArea();
        System.out.println();

        RectangularParallelepiped rectangularParallelepiped = new RectangularParallelepiped(2, 2, 2);
        rectangularParallelepiped.calcVolume();
        rectangularParallelepiped.calcArea();

    }
}