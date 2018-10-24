package lab6;



import java.util.ArrayList;

public class Diagram {
    private ArrayList<Layer> diagrams = new ArrayList<>();

    public void setDiagrams(Layer diagram) {
        diagrams.add(diagram);
    }
}