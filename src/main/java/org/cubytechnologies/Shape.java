package org.cubytechnologies;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
public abstract class Shape {
    protected double volume;
    protected double area;

    //вычисление объема фигуры
    public abstract void calcVolume();

    //вычисление объема фигуры
    public abstract void calcArea();
}
