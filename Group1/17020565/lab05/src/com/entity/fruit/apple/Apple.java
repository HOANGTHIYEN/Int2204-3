package com.entity.fruit.apple;

import com.entity.fruit.Fruit;

public class Apple extends Fruit {

    public Apple(String typeApple) {
        this.typeApple = typeApple;
    }

    protected String typeApple;

    public String getTypeApple() {
        return typeApple;
    }

    public void setTypeApple(String typeApple) {
        this.typeApple = typeApple;
    }

    @Override
    public String toString() {
        return "Đây là quả táo loại " + typeApple;
    }


}
