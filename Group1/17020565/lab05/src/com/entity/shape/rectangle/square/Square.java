package com.entity.shape.rectangle.square;

import com.entity.shape.rectangle.Rectangle;

public class Square extends Rectangle {
    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public Square(double side) {
        super(side, side);
    }

    public double getSize() {
        return super.getWidth();
    }

    public void setSize(double size) {
        setWidth(size);
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    @Override
    public void setLength(double length) {
        this.width = length;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "color='" + color +
                ", filled=" + filled +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
