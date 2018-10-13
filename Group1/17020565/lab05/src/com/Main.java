package com;

import com.entity.fruit.Fruit;
import com.entity.fruit.apple.Apple;
import com.entity.fruit.orange.CamCaoPhong;
import com.entity.fruit.orange.CamSanh;
import com.entity.fruit.orange.Orange;
import com.entity.shape.rectangle.square.Square;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Fruit apple = new Apple("tàu");
        Fruit orange = new Orange("đỏ");
        Fruit camCaoPhong = new CamCaoPhong("Hà nội", "Vinh");
        Fruit camSanh = new CamSanh("đỏ", "HCM");
        ArrayList<Fruit> fruitArrayList = new ArrayList<>();
        fruitArrayList.add(apple);
        fruitArrayList.add(orange);
        fruitArrayList.add(camCaoPhong);
        fruitArrayList.add(camSanh);
        for(Fruit fruitTemp : fruitArrayList){
            System.out.println(fruitTemp.toString());
        }

        Square square = new Square(4);
        System.out.println("side 4: " + square.getArea());
        System.out.println("side 4: length: " + square.getLength());
        square.setLength(5);
        System.out.println("side 5: " + square.getArea());
        square.setWidth(3);

        System.out.println("side 3: " + square.getArea());
    }
}
