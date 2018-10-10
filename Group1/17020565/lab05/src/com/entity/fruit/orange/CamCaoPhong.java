package com.entity.fruit.orange;

public class CamCaoPhong extends Orange {
    public CamCaoPhong(String color, String receive) {
        super(color);
        this.receive = receive;
    }

    protected String receive;

    public CamCaoPhong(String color) {
        super(color);
    }

    public String getReceive() {
        return receive;
    }

    public void setReceive(String receive) {
        this.receive = receive;
    }


    @Override
    public String toString() {
        return "Đây là quả cam cao phong kế thừa cam chuyển đến " + receive;
    }
}
