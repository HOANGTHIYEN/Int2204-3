package com.entity.fruit.orange;

import com.entity.fruit.Fruit;

public class Orange extends Fruit {

    protected String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Orange(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Đây là quả cam màu" + color;
    }
}
