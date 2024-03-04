package org.cubytechnologies;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
public abstract class Shape {
    private double volume;
    private double area;

    //вычисление объема фигуры
    public abstract void calcVolume();

    //вычисление объема фигуры
    public abstract void calcArea();
}
