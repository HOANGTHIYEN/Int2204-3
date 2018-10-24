
import java.util.ArrayList;

// lớp đại diện cho sơ đồ đang được vẽ

public class Diagram {

    public Diagram() {}
    private ArrayList<Layer> listLayer = new ArrayList<>();

    public ArrayList<Layer> getListLayer() {
        return listLayer;
    }

    public void setListLayer(ArrayList<Layer> listLayer) {
        this.listLayer = listLayer;
    }

    public void removeAllCircle() {
        for (int i = listLayer.size()-1; i >= 0 ; i--) {
            for (int j = listLayer.get(i).getListShape().size()-1; j >= 0 ; j--) {
                // kiem tra xem listShapr[i] cos phai thuoc doi tuong Circle khong va xoa
                if (listLayer.get(i).getListShape().get(j) instanceof Circle)
                    listLayer.get(i).getListShape().remove(j);
                    System.out.println("Xóa thành công hình tròn");
            }
        }

    }
}