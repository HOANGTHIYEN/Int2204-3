import java.util.ArrayList;
import java.util.List;

public class Layer {
    private ArrayList<Shape> shapeList = new ArrayList<>();
    boolean isVisible = true;

    /**
     * isVisible getter
     * @return isVisible
     */
    public boolean isVisible() {
        return isVisible;
    }

    /**
     * set isVisible
     * if isVisible = false all shape can not be drawn
     * @param visible
     */
    public void setVisible(boolean visible) {
        isVisible = visible;
        if (!isVisible) {
            for (Shape curShape: shapeList) {
                curShape.setExist(false);
            }
        }
    }

    /**
     * Delete all Triangle
     */
    public void deleteTriangle() {
        for (Shape curShape: shapeList) {
            if (curShape instanceof Triangle) {
                shapeList.remove(curShape);
            }
        }
    }

    /**
     * add new shape
     * @param _newShape
     */
    public void addShape(Shape _newShape) {
        this.shapeList.add(_newShape);
    }

    /**
     * @return shapeList
     */
    public ArrayList<Shape> getShapeList() {
        return this.shapeList;
    }

    /**
     * print a list of shape
     */
    public void printShapeList() {
        for (Shape curShape: shapeList) {
            curShape.location();
        }
    }

    /**
     * remove duplicated shape
     */
    public void removeDuplicate() {
        for (int j = 0; j<shapeList.size(); j++) {
            for (int i = j + 1; i<shapeList.size() ; i++) {
                if (shapeList.get(j).compareShape(shapeList.get(i))) {
                    shapeList.remove(i);
                }
            }
        }
    }

}