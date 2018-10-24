
//đối tượng thuộc lớp Diagram có một hoặc nhiều đối tượng thuộc lớp Layer

import java.util.ArrayList;

public class Layer {
    private ArrayList<Shape> listShape = new  ArrayList<>();

    public ArrayList<Shape> getListShape() {
        return listShape;
    }

    public void setListShape(ArrayList<Shape> listShape) {
        this.listShape = listShape;
    }

    public void removeAllTriangle() {
        for (int i = listShape.size()-1; i >= 0 ; i--) {
            // kiem tra xem listShapr[i] cos phai thuoc doi tuong Tam giac khong va xoa
            if (listShape.get(i) instanceof Triangle) {
                listShape.remove(i);
                System.out.println("Xóa thành công Hình tam giác");
            }
        }

    }
}