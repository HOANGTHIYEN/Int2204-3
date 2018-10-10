package com.entity.fruit.orange;

public class CamSanh extends Orange {

    protected  String comeFrom;

    public CamSanh(String color, String comeFrom) {
        super(color);
        this.comeFrom = comeFrom;
    }

    public CamSanh(String color) {
        super(color);
    }

    @Override
    public String toString() {
        return "Đây là quả cam sành kế thừa cam đến từ: " + comeFrom;
    }
}
